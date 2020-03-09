import com.pam.bsc.referential.ChildLink
import com.pam.bsc.referential.MaritalStatus
import com.pam.bsc.referential.ProfessionalStatus
import com.pam.bsc.referential.ScholarLevel
import com.pam.bsc.scholarship.inquiry.ScholarshipInquiry
import com.pam.bsc.scholarship.inquiry.ScholarshipInquiryChildInfo
import com.pam.bsc.scholarship.inquiry.ScholarshipInquiryDetail
import com.pam.bsc.user.*

import java.text.SimpleDateFormat

class BootStrap {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")

    def init = { servletContext ->

        ScholarshipInquiryDetail.Applicant applicant = new ScholarshipInquiryDetail.Applicant(
                birthName: 'Mata',
                firstName: 'Cyril',
                dateOfBirth: sdf.parse("01/01/1987"),
                placeOfBirth: 'Saint Maurice',
                nationality: 'Francaise',
                maritalStatus: MaritalStatus.CELIBATAIRE,
                childLink: ChildLink.PERE_MERE,
                proSituation: ProfessionalStatus.SALARIE,
                proSituationDate: sdf.parse("02/12/2019"),
                proEmployerName: 'CALINFO',
                proJobTitle: 'Dev',
                incomeMonthlyPay: 0,
        )

        ScholarshipInquiryDetail.Applicant conjoint = new ScholarshipInquiryDetail.Applicant(
                birthName: 'Prince',
                firstName: 'Aurélie',
                dateOfBirth: sdf.parse("01/10/1987"),
                placeOfBirth: 'Dreux',
                nationality: 'Francaise',
                maritalStatus: MaritalStatus.MARIE_PACSE,
                childLink: ChildLink.PERE_MERE,
                proSituation: ProfessionalStatus.PATENTE,
                incomeMonthlyPay: 0,
        )

        ScholarshipInquiryChildInfo childInfo = new ScholarshipInquiryChildInfo(
                gender: 'M',
                familyName: 'Mata',
                firstName: 'Pablo',
                dateOfBirth: new Date(),
                lastYearScholarLevel: ScholarLevel.CE1,
                nextYearScholarLevel: ScholarLevel.CE2,
                nextYearSchool: 'school',
                unschooled: false,
        )

        Collection<ScholarshipInquiryChildInfo> childrenInfo = new ArrayList<>();
        childrenInfo.add(childInfo)

        ScholarshipInquiryDetail inquiryDetail = new ScholarshipInquiryDetail(
                childrenInfo: childrenInfo,
                identity: new ScholarshipInquiryDetail.Identity(applicant: applicant, conjoint: conjoint)
        )
        ScholarshipInquiry inquiry = new ScholarshipInquiry(
                dateOfDemand: new Date(),
                status: ScholarshipInquiry.ScholarshipInquiryStatus.ACCEPTED,
                detail: inquiryDetail,
                message: 'Demande de bourse acceptée'
        )

        UserAddress address = new UserAddress(
                street: '49 rue Edouard Spahr',
                district: 'Val Plaisance',
                city: 'Nouméa',
                postalCode: '98800')

        UserContact contact = new UserContact(phoneCell: '723988')
        UserBank bank = new UserBank(
                bankName: 'Boursorama',
                iban: 'FR76 4061 8802 6400 0404 0203 549',
                bankAddress: '18, quai du Point du Jour 92659 Boulogne­Billancourt Cedex',
                bankCode: '40618',
                codeGuichet: '80264',
                accountNbr: '00040402035',
                ribKey: '49')

        ChildInfo child1 = new ChildInfo(
                gender: 'M',
                familyName: 'Mata',
                firstName: 'Pablo',
                dateOfBirth: new Date(),
                scholarLevel: ScholarLevel.CE1,
                scholarship: true
        )

        ChildInfo child2 = new ChildInfo(
                gender: 'F',
                familyName: 'Mata',
                firstName: 'Pablita',
                dateOfBirth: new Date(),
                scholarLevel: ScholarLevel.CINQUIEME,
                scholarship: false
        )

        Collection<ChildInfo> children = new ArrayList<>();
        children.add(child1)
        children.add(child2)

        Collection<ScholarshipInquiry> inquiries = new ArrayList<>();
        inquiries.add(inquiry)

        User user = new User(
                familyName: 'Mata',
                firstName: 'Cyril',
                email: 'a@a.a',
                password: 'a',
                addressInfo: address,
                bankInfo: bank,
                contactInfo: contact,
                scholarshipInquiries: inquiries,
                childrenInfo: children
        )

        try {
            childInfo.setInquiryDetail(inquiryDetail)
            inquiry.setUser(user)
            child1.setUser(user)
            child2.setUser(user)

            user.save(flush: true, failOnError: true)
        } catch (Exception e) {
            e.printStackTrace()
        }
    }
    def destroy = {
    }
}
