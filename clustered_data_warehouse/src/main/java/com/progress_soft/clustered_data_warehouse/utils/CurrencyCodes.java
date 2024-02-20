package com.progress_soft.clustered_data_warehouse.utils;

import java.util.HashMap;
import java.util.Map;

public class CurrencyCodes {
    private final Map<String, String> codeToNameMap;
    private final Map<String, String> nameToCodeMap;

    public CurrencyCodes() {
        codeToNameMap = new HashMap<>();
        nameToCodeMap = new HashMap<>();
        initializeMaps();
    }

    //I Could use an Online API for this.
    private void initializeMaps() {
        codeToNameMap.put("AED", "784");
        nameToCodeMap.put("784", "AED");

        codeToNameMap.put("AFN", "971");
        nameToCodeMap.put("971", "AFN");

        codeToNameMap.put("ALL", "008");
        nameToCodeMap.put("008", "ALL");

        codeToNameMap.put("AMD", "051");
        nameToCodeMap.put("051", "AMD");

        codeToNameMap.put("ANG", "532");
        nameToCodeMap.put("532", "ANG");

        codeToNameMap.put("AOA", "973");
        nameToCodeMap.put("973", "AOA");

        codeToNameMap.put("ARS", "032");
        nameToCodeMap.put("032", "ARS");

        codeToNameMap.put("AUD", "036");
        nameToCodeMap.put("036", "AUD");

        codeToNameMap.put("AWG", "533");
        nameToCodeMap.put("533", "AWG");

        codeToNameMap.put("AZN", "944");
        nameToCodeMap.put("944", "AZN");

        codeToNameMap.put("BAM", "977");
        nameToCodeMap.put("977", "BAM");

        codeToNameMap.put("BBD", "052");
        nameToCodeMap.put("052", "BBD");

        codeToNameMap.put("BDT", "050");
        nameToCodeMap.put("050", "BDT");

        codeToNameMap.put("BGN", "975");
        nameToCodeMap.put("975", "BGN");

        codeToNameMap.put("BHD", "048");
        nameToCodeMap.put("048", "BHD");

        codeToNameMap.put("BIF", "108");
        nameToCodeMap.put("108", "BIF");

        codeToNameMap.put("BMD", "060");
        nameToCodeMap.put("060", "BMD");

        codeToNameMap.put("BND", "096");
        nameToCodeMap.put("096", "BND");

        codeToNameMap.put("BOB", "068");
        nameToCodeMap.put("068", "BOB");

        codeToNameMap.put("BOV", "984");
        nameToCodeMap.put("984", "BOV");

        codeToNameMap.put("BRL", "986");
        nameToCodeMap.put("986", "BRL");

        codeToNameMap.put("BSD", "044");
        nameToCodeMap.put("044", "BSD");

        codeToNameMap.put("BTN", "064");
        nameToCodeMap.put("064", "BTN");

        codeToNameMap.put("BWP", "072");
        nameToCodeMap.put("072", "BWP");

        codeToNameMap.put("BYN", "933");
        nameToCodeMap.put("933", "BYN");

        codeToNameMap.put("BZD", "084");
        nameToCodeMap.put("084", "BZD");

        codeToNameMap.put("CAD", "124");
        nameToCodeMap.put("124", "CAD");

        codeToNameMap.put("CDF", "976");
        nameToCodeMap.put("976", "CDF");

        codeToNameMap.put("CHE", "947");
        nameToCodeMap.put("947", "CHE");

        codeToNameMap.put("CHF", "756");
        nameToCodeMap.put("756", "CHF");

        codeToNameMap.put("CHW", "948");
        nameToCodeMap.put("948", "CHW");

        codeToNameMap.put("CLF", "990");
        nameToCodeMap.put("990", "CLF");

        codeToNameMap.put("CLP", "152");
        nameToCodeMap.put("152", "CLP");

        codeToNameMap.put("CNY", "156");
        nameToCodeMap.put("156", "CNY");

        codeToNameMap.put("COP", "170");
        nameToCodeMap.put("170", "COP");

        codeToNameMap.put("COU", "970");
        nameToCodeMap.put("970", "COU");

        codeToNameMap.put("CRC", "188");
        nameToCodeMap.put("188", "CRC");

        codeToNameMap.put("CUC", "931");
        nameToCodeMap.put("931", "CUC");

        codeToNameMap.put("CUP", "192");
        nameToCodeMap.put("192", "CUP");

        codeToNameMap.put("CVE", "132");
        nameToCodeMap.put("132", "CVE");

        codeToNameMap.put("CZK", "203");
        nameToCodeMap.put("203", "CZK");

        codeToNameMap.put("DJF", "262");
        nameToCodeMap.put("262", "DJF");

        codeToNameMap.put("DKK", "208");
        nameToCodeMap.put("208", "DKK");

        codeToNameMap.put("DOP", "214");
        nameToCodeMap.put("214", "DOP");

        codeToNameMap.put("DZD", "012");
        nameToCodeMap.put("012", "DZD");

        codeToNameMap.put("EGP", "818");
        nameToCodeMap.put("818", "EGP");

        codeToNameMap.put("ERN", "232");
        nameToCodeMap.put("232", "ERN");

        codeToNameMap.put("ETB", "230");
        nameToCodeMap.put("230", "ETB");

        codeToNameMap.put("EUR", "978");
        nameToCodeMap.put("978", "EUR");

        codeToNameMap.put("FJD", "242");
        nameToCodeMap.put("242", "FJD");

        codeToNameMap.put("FKP", "238");
        nameToCodeMap.put("238", "FKP");

        codeToNameMap.put("FOK", "032");
        nameToCodeMap.put("032", "FOK");

        codeToNameMap.put("GBP", "826");
        nameToCodeMap.put("826", "GBP");

        codeToNameMap.put("GEL", "981");
        nameToCodeMap.put("981", "GEL");

        codeToNameMap.put("GGP", "292");
        nameToCodeMap.put("292", "GGP");

        codeToNameMap.put("GHS", "936");
        nameToCodeMap.put("936", "GHS");

        codeToNameMap.put("GIP", "292");
        nameToCodeMap.put("292", "GIP");

        codeToNameMap.put("GMD", "270");
        nameToCodeMap.put("270", "GMD");

        codeToNameMap.put("GNF", "324");
        nameToCodeMap.put("324", "GNF");

        codeToNameMap.put("GTQ", "320");
        nameToCodeMap.put("320", "GTQ");

        codeToNameMap.put("GYD", "328");
        nameToCodeMap.put("328", "GYD");

        codeToNameMap.put("HKD", "344");
        nameToCodeMap.put("344", "HKD");

        codeToNameMap.put("HNL", "340");
        nameToCodeMap.put("340", "HNL");

        codeToNameMap.put("HRK", "191");
        nameToCodeMap.put("191", "HRK");

        codeToNameMap.put("HTG", "332");
        nameToCodeMap.put("332", "HTG");

        codeToNameMap.put("HUF", "348");
        nameToCodeMap.put("348", "HUF");

        codeToNameMap.put("IDR", "360");
        nameToCodeMap.put("360", "IDR");

        codeToNameMap.put("ILS", "376");
        nameToCodeMap.put("376", "ILS");

        codeToNameMap.put("IMP", "292");
        nameToCodeMap.put("292", "IMP");

        codeToNameMap.put("INR", "356");
        nameToCodeMap.put("356", "INR");

        codeToNameMap.put("IQD", "368");
        nameToCodeMap.put("368", "IQD");

        codeToNameMap.put("IRR", "364");
        nameToCodeMap.put("364", "IRR");

        codeToNameMap.put("ISK", "352");
        nameToCodeMap.put("352", "ISK");

        codeToNameMap.put("JEP", "292");
        nameToCodeMap.put("292", "JEP");

        codeToNameMap.put("JMD", "388");
        nameToCodeMap.put("388", "JMD");

        codeToNameMap.put("JOD", "400");
        nameToCodeMap.put("400", "JOD");

        codeToNameMap.put("JPY", "392");
        nameToCodeMap.put("392", "JPY");

        codeToNameMap.put("KES", "404");
        nameToCodeMap.put("404", "KES");

        codeToNameMap.put("KGS", "417");
        nameToCodeMap.put("417", "KGS");

        codeToNameMap.put("KHR", "116");
        nameToCodeMap.put("116", "KHR");

        codeToNameMap.put("KID", "292");
        nameToCodeMap.put("292", "KID");

        codeToNameMap.put("KMF", "174");
        nameToCodeMap.put("174", "KMF");

        codeToNameMap.put("KRW", "410");
        nameToCodeMap.put("410", "KRW");

        codeToNameMap.put("KWD", "414");
        nameToCodeMap.put("414", "KWD");

        codeToNameMap.put("KYD", "136");
        nameToCodeMap.put("136", "KYD");

        codeToNameMap.put("KZT", "398");
        nameToCodeMap.put("398", "KZT");

        codeToNameMap.put("LAK", "418");
        nameToCodeMap.put("418", "LAK");

        codeToNameMap.put("LBP", "422");
        nameToCodeMap.put("422", "LBP");

        codeToNameMap.put("LKR", "144");
        nameToCodeMap.put("144", "LKR");

        codeToNameMap.put("LRD", "430");
        nameToCodeMap.put("430", "LRD");

        codeToNameMap.put("LSL", "426");
        nameToCodeMap.put("426", "LSL");

        codeToNameMap.put("LYD", "434");
        nameToCodeMap.put("434", "LYD");

        codeToNameMap.put("MAD", "504");
        nameToCodeMap.put("504", "MAD");

        codeToNameMap.put("MDL", "498");
        nameToCodeMap.put("498", "MDL");

        codeToNameMap.put("MGA", "969");
        nameToCodeMap.put("969", "MGA");

        codeToNameMap.put("MKD", "807");
        nameToCodeMap.put("807", "MKD");

        codeToNameMap.put("MMK", "104");
        nameToCodeMap.put("104", "MMK");

        codeToNameMap.put("MNT", "496");
        nameToCodeMap.put("496", "MNT");

        codeToNameMap.put("MOP", "446");
        nameToCodeMap.put("446", "MOP");

        codeToNameMap.put("MRU", "929");
        nameToCodeMap.put("929", "MRU");

        codeToNameMap.put("MUR", "480");
        nameToCodeMap.put("480", "MUR");

        codeToNameMap.put("MVR", "462");
        nameToCodeMap.put("462", "MVR");

        codeToNameMap.put("MWK", "454");
        nameToCodeMap.put("454", "MWK");

        codeToNameMap.put("MXN", "484");
        nameToCodeMap.put("484", "MXN");

        codeToNameMap.put("MXV", "979");
        nameToCodeMap.put("979", "MXV");

        codeToNameMap.put("MYR", "458");
        nameToCodeMap.put("458", "MYR");

        codeToNameMap.put("MZN", "943");
        nameToCodeMap.put("943", "MZN");

        codeToNameMap.put("NAD", "516");
        nameToCodeMap.put("516", "NAD");

        codeToNameMap.put("NGN", "566");
        nameToCodeMap.put("566", "NGN");

        codeToNameMap.put("NIO", "558");
        nameToCodeMap.put("558", "NIO");

        codeToNameMap.put("NOK", "578");
        nameToCodeMap.put("578", "NOK");

        codeToNameMap.put("NPR", "524");
        nameToCodeMap.put("524", "NPR");

        codeToNameMap.put("NZD", "554");
        nameToCodeMap.put("554", "NZD");

        codeToNameMap.put("OMR", "512");
        nameToCodeMap.put("512", "OMR");

        codeToNameMap.put("PAB", "590");
        nameToCodeMap.put("590", "PAB");

        codeToNameMap.put("PEN", "604");
        nameToCodeMap.put("604", "PEN");

        codeToNameMap.put("PGK", "598");
        nameToCodeMap.put("598", "PGK");

        codeToNameMap.put("PHP", "608");
        nameToCodeMap.put("608", "PHP");

        codeToNameMap.put("PKR", "586");
        nameToCodeMap.put("586", "PKR");

        codeToNameMap.put("PLN", "985");
        nameToCodeMap.put("985", "PLN");

        codeToNameMap.put("PYG", "600");
        nameToCodeMap.put("600", "PYG");

        codeToNameMap.put("QAR", "634");
        nameToCodeMap.put("634", "QAR");

        codeToNameMap.put("RON", "946");
        nameToCodeMap.put("946", "RON");

        codeToNameMap.put("RSD", "941");
        nameToCodeMap.put("941", "RSD");

        codeToNameMap.put("RUB", "643");
        nameToCodeMap.put("643", "RUB");

        codeToNameMap.put("RWF", "646");
        nameToCodeMap.put("646", "RWF");

        codeToNameMap.put("SAR", "682");
        nameToCodeMap.put("682", "SAR");

        codeToNameMap.put("SBD", "090");
        nameToCodeMap.put("090", "SBD");

        codeToNameMap.put("SCR", "690");
        nameToCodeMap.put("690", "SCR");

        codeToNameMap.put("SDG", "938");
        nameToCodeMap.put("938", "SDG");

        codeToNameMap.put("SEK", "752");
        nameToCodeMap.put("752", "SEK");

        codeToNameMap.put("SGD", "702");
        nameToCodeMap.put("702", "SGD");

        codeToNameMap.put("SHP", "654");
        nameToCodeMap.put("654", "SHP");

        codeToNameMap.put("SLL", "694");
        nameToCodeMap.put("694", "SLL");

        codeToNameMap.put("SOS", "706");
        nameToCodeMap.put("706", "SOS");

        codeToNameMap.put("SRD", "968");
        nameToCodeMap.put("968", "SRD");

        codeToNameMap.put("SSP", "728");
        nameToCodeMap.put("728", "SSP");

        codeToNameMap.put("STN", "930");
        nameToCodeMap.put("930", "STN");

        codeToNameMap.put("SYP", "760");
        nameToCodeMap.put("760", "SYP");

        codeToNameMap.put("SZL", "748");
        nameToCodeMap.put("748", "SZL");

        codeToNameMap.put("THB", "764");
        nameToCodeMap.put("764", "THB");

        codeToNameMap.put("TJS", "972");
        nameToCodeMap.put("972", "TJS");

        codeToNameMap.put("TMT", "934");
        nameToCodeMap.put("934", "TMT");

        codeToNameMap.put("TND", "788");
        nameToCodeMap.put("788", "TND");

        codeToNameMap.put("TOP", "776");
        nameToCodeMap.put("776", "TOP");

        codeToNameMap.put("TRY", "949");
        nameToCodeMap.put("949", "TRY");

        codeToNameMap.put("TTD", "780");
        nameToCodeMap.put("780", "TTD");

        codeToNameMap.put("TWD", "901");
        nameToCodeMap.put("901", "TWD");

        codeToNameMap.put("TZS", "834");
        nameToCodeMap.put("834", "TZS");

        codeToNameMap.put("UAH", "980");
        nameToCodeMap.put("980", "UAH");

        codeToNameMap.put("UGX", "800");
        nameToCodeMap.put("800", "UGX");

        codeToNameMap.put("USD", "840");
        nameToCodeMap.put("840", "USD");

        codeToNameMap.put("USN", "997");
        nameToCodeMap.put("997", "USN");

        codeToNameMap.put("UYI", "940");
        nameToCodeMap.put("940", "UYI");

        codeToNameMap.put("UYU", "858");
        nameToCodeMap.put("858", "UYU");

        codeToNameMap.put("UZS", "860");
        nameToCodeMap.put("860", "UZS");

        codeToNameMap.put("VEF", "937");
        nameToCodeMap.put("937", "VEF");

        codeToNameMap.put("VND", "704");
        nameToCodeMap.put("704", "VND");

        codeToNameMap.put("VUV", "548");
        nameToCodeMap.put("548", "VUV");

        codeToNameMap.put("WST", "882");
        nameToCodeMap.put("882", "WST");

        codeToNameMap.put("XAF", "950");
        nameToCodeMap.put("950", "XAF");

        codeToNameMap.put("XCD", "951");
        nameToCodeMap.put("951", "XCD");

        codeToNameMap.put("XDR", "960");
        nameToCodeMap.put("960", "XDR");

        codeToNameMap.put("XOF", "952");
        nameToCodeMap.put("952", "XOF");

        codeToNameMap.put("XPF", "953");
        nameToCodeMap.put("953", "XPF");

        codeToNameMap.put("XSU", "994");
        nameToCodeMap.put("994", "XSU");

        codeToNameMap.put("XUA", "965");
        nameToCodeMap.put("965", "XUA");

        codeToNameMap.put("YER", "886");
        nameToCodeMap.put("886", "YER");

        codeToNameMap.put("ZAR", "710");
        nameToCodeMap.put("710", "ZAR");

        codeToNameMap.put("ZMW", "967");
        nameToCodeMap.put("967", "ZMW");

        codeToNameMap.put("ZWL", "932");
        nameToCodeMap.put("932", "ZWL");
    }

    public String getIsoCode(String code) {
        if (nameToCodeMap.containsKey(code)) {
            return nameToCodeMap.get(code);
        } else if (codeToNameMap.containsKey(code)) {
            return code;
        } else
            return "false";
    }
}
