package com.inetwork.web.data.shared.dto.orders.dlda;

public enum TitleOfAddress
{

   _1LT("1Lt", "First Lieutenant"),
   _1SGT("1Sgt", "First Sergeant"),
   _2LT("2LT", "2nd Lieutenant"),
   ADM("Adm", "Admiral"),
   AMN("Amn", "Airman"),
   ATTY("Atty", "Attorney"),
   BC("BC", "Bachelor of Chemistry"),
   BCE("BCE", "Bachelor of Chemical Engineering"),
   BD("BD", "Bachelor of Divinity"),
   BDS("BDS", "Bachelor of Dental Surgery"),
   BE("BE", "Bachelor of Education, Bachelor of Engineering"),
   BM("BM", "Bachelor of Medicine"),
   BMS("BMS", "Bachelor of Marine Science"),
   BPE("BPE", "Bachelor of Physical Education"),
   BPh("BPh", "Bachelor of Philosophy"),
   BRIGGEN("BrigGen", "Brigadier General"),
   BSN("BSN", "Bachelor of Science in Nursing"),
   BSNE("BSNE", "Bachelor of Science in Nursing Education"),
   CAPT("Capt", "Captain"),
   CMDR("Cmdr", "Commander"),
   COL("Col", "Colonel"),
   CPA("CPA", "Certified Public Accountant"),
   CPL("Cpl", "Corporal"),
   CPO("CPO", "Chief Petty Officer"),
   CWO("CWO", "Chief Warrant Officer"),
   CWO2("CWO2", "Chief Warrant Officer 2"),
   DBA("DBA", "Doctor of Business Administration"),
   DC("DC", "Doctor of Chiropractic"),
   DDS("DDS", "Doctor of Dental Surgery, Doctor of Dental Science"),
   DED("Ded", "Doctor of Education"),
   DMD("DMD", "Doctor of Dental Medicine"),
   DO("DO", "Doctor of Optometry, Doctor of Osteopathy"),
   DR("Dr", "Doctor"),
   DVM("DVM", "Doctor of Veterinary Medicine"),
   DVS("DVS", "Doctor of Veterinary Surgery"),
   ESN("Esn", "Ensign"),
   ESQ("Esq", "Esquire"),
   FACA("FACA", "Fellow of the American College of Anesthesiologists"),
   FACC("FACC", "Fellow of the American College of Cardiologists"),
   FACOG("FACOG", "Fellow of the American College of Obstetricians and Gynecologists"),
   FACP("FACP", "Fellow of the American College of Physicians"),
   FACR("FACR", "Fellow of the American College of Radiologists"),
   FACS("FACS", "Fellow of the American College of Surgeons"),
   FADC("FADC", "Fellow of the American College of Dentists"),
   FCAP("FCAP", "Fellow of the College of American Pathologists"),
   FCPS("FCPS", "Fellow of the College of Physicians and Surgeons"),
   FIRST_LT("First Lt", "First Lieutenant"),
   FIRST_SGT("First Sgt", "First Sergeant"),
   FO("FO", "Flight Officer"),
   FR("Fr", "Father"),
   GEN("Gen", "General"),
   GEN_RET("Gen Ret", "General Retired"),
   GNYSGT("GnySgt", "Gunnery Sergeant"),
   GOV("Gov", "Governor"),
   HON("Hon", "Honorable"),
   JUS("Jus", "Justice"),
   LMT("LMT", "Licensed Massage Therapist"),
   LNCCPL("LncCpl", "Lance Corporal"),
   LPN("LPN", "Licensed Practical Nurse"),
   LPT("LPT", "Licensed Physical Therapist"),
   LT("Lt", "Lieutenant"),
   LTCOL("LtCol", "Lieutenant Colonel"),
   LTCOL_RET("LtCol Ret", "Lieutenant Colonel Retired"),
   LTJG("LtJG", "Lieutenant Junior Grade"),
   MAJ("Maj", "Major"),
   MAJ_RET("Maj Ret", "Major Retired"),
   MAJGEN("MajGen", "Major General"),
   MAJGEN_RET("MajGen Ret", "Major General Retired"),
   MD("MD", "Doctor of Medicine"),
   MN("MN", "Master of Nursing"),
   MPA("MPA", "Master of Public Accounting"),
   MSTRSGT("MstrSgt", "Master Sergeant"),
   OD("OD", "Doctor of Optometry"),
   PC("PC", "Privy Council"),
   PHD("PhD", "Doctor of Philosophy"),
   PLTNSGT("PltnSgt", "Platoon Sergeant"),
   PO("PO", "Petty Officer"),
   PO3("PO3", "Petty Officer 3"),
   PROF("Prof", "Professor"),
   PS("PS", "Public Servant"),
   PT("PT", "Physical Therapist"),
   PVT("Pvt", "Private"),
   RD("RD", "Registered Dietician"),
   RET("Ret", "Retired"),
   REV("Rev", "Reverend"),
   REV_DR("Rev Dr", "Reverend Doctor"),
   REV_FR("Rev Fr", "Reverend Father"),
   REV_MOTHER("Rev Mother", "Reverend Mother"),
   RN("RN", "Registered Nurse"),
   RNP("RNP", "Registered Nurse Practicioner"),
   RPH("RPh", "Registered Pharmacist"),
   RPT("RPT", "Registered Physical Therapist"),
   SGT("Sgt", "Sergeant"),
   SGT1("Sgt1", "Sergeant First Class"),
   SGTFC("SgtFC", "Sergeant First Class"),
   SGTMAJ("SgtMaj", "Sergeant Major"),
   SQD_LDR("Sqd Ldr", "Squadron Leader"),
   SSGTMAJ("SsgtMaj", "Staff Sergeant Major"),
   STFSGT("StfSgt", "Staff Sergeant"),
   TECHSGT("TechSgt", "Tech Sergeant"),
   VMD("VMD", "Doctor Of Veterinary Medicine"),
   WO("WO", "Warrant Officer");

   private String abbreviation;
   private String description;

   TitleOfAddress(String abbreviation, String description)
   {
      this.abbreviation = abbreviation;
      this.description = description;
   }

   public String getAbbreviation()
   {
      return abbreviation;
   }

   public String getDescription()
   {
      return description;
   }

   public static TitleOfAddress getTitleByAbbreviation(String abbreviation)
   {
      for (TitleOfAddress titleOfAddress : values())
      {
         if (titleOfAddress.abbreviation.equalsIgnoreCase(abbreviation))
         {
            return titleOfAddress;
         }
      }
      return null;
   }
}
