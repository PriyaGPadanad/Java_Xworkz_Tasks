package com.xworkz.country.runner;

        import com.xworkz.country.dto.*;

        import java.util.ArrayList;
        import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {






















        System.out.println("1....");

        List<StaffDTO> staff1 = new ArrayList<>();
        staff1.add(new StaffDTO("Nisha", "Developer", new DetailDTO("Hard Worker", 22, new EducationDTO("BE", 2018, new UniversityDTO("VTU", 123, new ChancellorDTO("Kiran", 10, "PhD"))))));
        staff1.add(new StaffDTO("Usha", "Tester", new DetailDTO("Quick Learner", 23, new EducationDTO("BCA", 2019, new UniversityDTO("BU", 234, new ChancellorDTO("Shree", 11, "PhD"))))));

        HeadOfDepartmentDTO hod1 = new HeadOfDepartmentDTO("Anand", 20, staff1);
        DepartmentDTO dept1 = new DepartmentDTO("Computer Science", hod1);

        List<PortfolioDTO> portfolios1 = new ArrayList<>();
        portfolios1.add(new PortfolioDTO("CM", "Technical", dept1));

        MinisterDTO minister1 = new MinisterDTO("Pinarayi", 58, portfolios1);

        List<MinisterDTO> ministers1 = new ArrayList<>();
        ministers1.add(minister1);

        StateDTO state1 = new StateDTO("Kerala", 600000, ministers1);

        List<StateDTO> states = new ArrayList<>();
        states.add(state1);

        CountryDTO country = new CountryDTO("India", 40, states);
        System.out.println(country);

        System.out.println("2....");
        List<StaffDTO> staff2 = new ArrayList<>();
        staff2.add(new StaffDTO("Deepu", "Manager", new DetailDTO("Creative", 26, new EducationDTO("MBA", 2017, new UniversityDTO("IIM", 444, new ChancellorDTO("Raj", 12, "PhD"))))));
        staff2.add(new StaffDTO("Sampu", "Accountant", new DetailDTO("Punctual", 25, new EducationDTO("MCom", 2016, new UniversityDTO("BU", 555, new ChancellorDTO("Kavitha", 15, "PhD"))))));

        HeadOfDepartmentDTO hod2 = new HeadOfDepartmentDTO("Sandeep", 15, staff2);
        DepartmentDTO dept2 = new DepartmentDTO("Finance", hod2);

        List<PortfolioDTO> portfolios2 = new ArrayList<>();
        portfolios2.add(new PortfolioDTO("Finance Minister", "Economics", dept2));

        MinisterDTO minister2 = new MinisterDTO("Basavaraj", 55, portfolios2);

        List<MinisterDTO> ministers2 = new ArrayList<>();
        ministers2.add(minister2);

        StateDTO state2 = new StateDTO("Karnataka", 900000, ministers2);
        states.add(state2);

        System.out.println(country);




















        System.out.println("1-------------------------------");

        List<StaffDTO> staff1 = new ArrayList<>();
        staff1.add(new StaffDTO("Emma Rousseau", "Taxation", new DetailDTO("5yrs", 45000, new EducationDTO("BBM", "Université de Strasbourg", new UniversityDTO("Université de Strasbourg", 21000, new ChancellorDTO("Dr. Hugo Renaud", 59, 14))))));
        staff1.add(new StaffDTO("Lucas Fabre", "Audit", new DetailDTO("3.5yrs", 38000, new EducationDTO("MBA", "HEC Paris", new UniversityDTO("HEC Paris", 22000, new ChancellorDTO("Dr. Anaïs Noël", 57, 13))))));
        staff1.add(new StaffDTO("Chloé Giraud", "Finance", new DetailDTO("2.9yrs", 36000, new EducationDTO("BCom", "NEOMA Business School", new UniversityDTO("NEOMA", 20000, new ChancellorDTO("Dr. Bastien Dufour", 56, 12))))));
        staff1.add(new StaffDTO("Gabriel Roy", "Budget Planning", new DetailDTO("2.2yrs", 34000, new EducationDTO("BA", "INSEEC", new UniversityDTO("INSEEC", 19500, new ChancellorDTO("Dr. Claire Millet", 52, 10))))));

        HeadOfDepartmentDTO hod1 = new HeadOfDepartmentDTO("Dr. Vincent Morel", 59, staff1);
        DepartmentDTO dept1 = new DepartmentDTO();

        List<PortfolioDTO> portfolios1 = new ArrayList<>();
        portfolios1.add(new PortfolioDTO("Housing Schemes", 2, dept1));
        portfolios1.add(new PortfolioDTO("Municipal Budget", 1, dept1));

        MinisterDTO minister1 = new MinisterDTO();

        List<MinisterDTO> ministers1 = new ArrayList<>();
        ministers1.add(minister1);

        StateDTO state1 = new StateDTO("Karnataka", "Bangalore", ministers1);

        List<StateDTO> states1 = new ArrayList<>();
        states1.add(state1);

        CountryDTO country1 = new CountryDTO();


        System.out.println(country1);

        System.out.println("2-------------------------------");

        List<StaffDTO> staff2 = new ArrayList<>();
        staff2.add(new StaffDTO("John Doe", "Finance", new DetailDTO("6yrs", 60000, new EducationDTO("BBA", "Harvard", new UniversityDTO("Harvard", 50000, new ChancellorDTO("Dr. Steve Jobs", 62, 30))))));
        staff2.add(new StaffDTO("Jane Smith", "Accounting", new DetailDTO("4.2yrs", 48000, new EducationDTO("MBA", "Stanford", new UniversityDTO("Stanford", 45000, new ChancellorDTO("Dr. Elon Musk", 50, 20))))));
        staff2.add(new StaffDTO("Alice Johnson", "Auditor", new DetailDTO("3yrs", 47000, new EducationDTO("BCom", "Yale", new UniversityDTO("Yale", 43000, new ChancellorDTO("Dr. Bill Gates", 67, 40))))));
        staff2.add(new StaffDTO("Bob Brown", "Compliance", new DetailDTO("2.5yrs", 45000, new EducationDTO("BA", "Columbia", new UniversityDTO("Columbia", 42000, new ChancellorDTO("Dr. Mark Zuckerberg", 45, 25))))));

        HeadOfDepartmentDTO hod2 = new HeadOfDepartmentDTO("Dr. Robert Smith", 60, staff2);
        DepartmentDTO dept2 = new DepartmentDTO();

        List<PortfolioDTO> portfolios2 = new ArrayList<>();
        portfolios2.add(new PortfolioDTO("Infrastructure", 2, dept2));
        portfolios2.add(new PortfolioDTO("Roads and Bridges", 1, dept2));

        MinisterDTO minister2 = new MinisterDTO();

        List<MinisterDTO> ministers2 = new ArrayList<>();
        ministers2.add(minister2);

        StateDTO state2 = new StateDTO("California", "Los Angeles", ministers2);

        List<StateDTO> states2 = new ArrayList<>();
        states2.add(state2);

        CountryDTO country2 = new CountryDTO();

        System.out.println(country2);

        System.out.println("3-------------------------------");

        List<StaffDTO> staffTokyo = new ArrayList<>();
        staffTokyo.add(new StaffDTO("Haruto Saito", "Public Finance", new DetailDTO("6yrs", 48000, new EducationDTO("MBA", "Keio University", new UniversityDTO("Keio University", 25000, new ChancellorDTO("Dr. Naomi Yamamoto", 61, 15))))));
        staffTokyo.add(new StaffDTO("Yui Tanaka", "Auditing", new DetailDTO("4yrs", 42000, new EducationDTO("BCom", "University of Tokyo", new UniversityDTO("University of Tokyo", 26000, new ChancellorDTO("Dr. Hiroshi Aoki", 63, 16))))));
        staffTokyo.add(new StaffDTO("Ren Yamazaki", "Urban Planning", new DetailDTO("5.5yrs", 45000, new EducationDTO("MURP", "Kyoto University", new UniversityDTO("Kyoto University", 24000, new ChancellorDTO("Dr. Sakura Watanabe", 60, 14))))));
        staffTokyo.add(new StaffDTO("Aoi Kobayashi", "Housing", new DetailDTO("3yrs", 39000, new EducationDTO("BA", "Waseda University", new UniversityDTO("Waseda University", 23000, new ChancellorDTO("Dr. Kenta Fujimoto", 58, 13))))));

        HeadOfDepartmentDTO hodTokyo = new HeadOfDepartmentDTO("Dr. Shunichi Mori", 62, staffTokyo);
        DepartmentDTO deptTokyo = new DepartmentDTO();

        List<PortfolioDTO> tokyoPortfolios = new ArrayList<>();
        tokyoPortfolios.add(new PortfolioDTO("Infrastructure Projects", 2, deptTokyo));


        MinisterDTO ministerJP1 = new MinisterDTO();
        MinisterDTO ministerJP2 = new MinisterDTO();
        MinisterDTO ministerJP3 = new MinisterDTO();

        List<MinisterDTO> japanMinisters = new ArrayList<>();
        japanMinisters.add(ministerJP1);
        japanMinisters.add(ministerJP2);
        japanMinisters.add(ministerJP3);

        StateDTO stateTokyo = new StateDTO("Tokyo", "Chiyoda", japanMinisters);
        StateDTO stateOsaka = new StateDTO("Osaka", "Osaka City", japanMinisters);
        StateDTO stateKyoto = new StateDTO("Kyoto", "Kyoto City", japanMinisters);
        StateDTO stateHokkaido = new StateDTO("Hokkaido", "Sapporo", japanMinisters);
        StateDTO stateNagoya = new StateDTO("Nagoya", "Nagoya City", japanMinisters);

        List<StateDTO> japanStates = new ArrayList<>();
        japanStates.add(stateTokyo);
        japanStates.add(stateOsaka);
        japanStates.add(stateKyoto);
        japanStates.add(stateHokkaido);
        japanStates.add(stateNagoya);

        CountryDTO country3 = new CountryDTO();


        List<StaffDTO> staffBerlin = new ArrayList<>();
        staffBerlin.add(new StaffDTO("Lukas Schneider", "Revenue Control", new DetailDTO("7.2yrs", 52000, new EducationDTO("MSc Finance", "Humboldt University", new UniversityDTO("Humboldt University", 24000, new ChancellorDTO("Dr. Anna Krüger", 60, 14))))));
        staffBerlin.add(new StaffDTO("Sophia Wagner", "Project Funds", new DetailDTO("5yrs", 47000, new EducationDTO("MCom", "University of Munich", new UniversityDTO("University of Munich", 25000, new ChancellorDTO("Dr. Felix Weber", 62, 15))))));
        staffBerlin.add(new StaffDTO("Jonas Becker", "Digital Planning", new DetailDTO("4.3yrs", 43000, new EducationDTO("MBA", "RWTH Aachen", new UniversityDTO("RWTH Aachen", 23500, new ChancellorDTO("Dr. Lara Fischer", 59, 13))))));
        staffBerlin.add(new StaffDTO("Mia Neumann", "Administrative Affairs", new DetailDTO("3.6yrs", 41000, new EducationDTO("BBA", "Heidelberg University", new UniversityDTO("Heidelberg University", 22000, new ChancellorDTO("Dr. Elias Hoffmann", 57, 12))))));

        HeadOfDepartmentDTO hodBerlin = new HeadOfDepartmentDTO("Dr. Maximilian Köhler", 63, staffBerlin);
        DepartmentDTO deptBerlin = new DepartmentDTO();

        List<PortfolioDTO> berlinPortfolios = new ArrayList<>();
        berlinPortfolios.add(new PortfolioDTO("Digital Infrastructure", 3, deptBerlin));
        berlinPortfolios.add(new PortfolioDTO("Budget Allocation", 2, deptBerlin));

        MinisterDTO ministerDE1 = new MinisterDTO();
        MinisterDTO ministerDE2 = new MinisterDTO();
        MinisterDTO ministerDE3 = new MinisterDTO();

        List<MinisterDTO> germanyMinisters = new ArrayList<>();
        germanyMinisters.add(ministerDE1);
        germanyMinisters.add(ministerDE2);
        germanyMinisters.add(ministerDE3);

        StateDTO stateBerlin = new StateDTO("Berlin", "Mitte", germanyMinisters);
        StateDTO stateBavaria = new StateDTO("Bavaria", "Munich", germanyMinisters);
        StateDTO stateHesse = new StateDTO("Hesse", "Wiesbaden", germanyMinisters);
        StateDTO stateHamburg = new StateDTO("Hamburg", "Hamburg City", germanyMinisters);
        StateDTO stateSaxony = new StateDTO("Saxony", "Dresden", germanyMinisters);

        List<StateDTO> germanyStates = new ArrayList<>();
        germanyStates.add(stateBerlin);
        germanyStates.add(stateBavaria);
        germanyStates.add(stateHesse);
        germanyStates.add(stateHamburg);
        germanyStates.add(stateSaxony);

        CountryDTO country4 = new CountryDTO();

        System.out.println("5-------------------------------");

        List<StaffDTO> staff5 = new ArrayList<>();
        staff5.add(new StaffDTO("Oliver Wilson", "Urban Development", new DetailDTO("5.5yrs", 46000, new EducationDTO("MUP", "University of Melbourne", new UniversityDTO("University of Melbourne", 25000, new ChancellorDTO("Dr. Emily Carter", 60, 16))))));
        staff5.add(new StaffDTO("Isla Thompson", "Public Policy", new DetailDTO("4yrs", 44000, new EducationDTO("MPP", "University of Sydney", new UniversityDTO("University of Sydney", 24000, new ChancellorDTO("Dr. Liam Jackson", 58, 15))))));
        staff5.add(new StaffDTO("Jack Martin", "Economic Planning", new DetailDTO("3.8yrs", 42000, new EducationDTO("MCom", "University of Queensland", new UniversityDTO("University of Queensland", 23000, new ChancellorDTO("Dr. Ava White", 59, 14))))));
        staff5.add(new StaffDTO("Charlotte Taylor", "Transport Policy", new DetailDTO("3.2yrs", 40000, new EducationDTO("BA", "Monash University", new UniversityDTO("Monash University", 22000, new ChancellorDTO("Dr. Noah Harris", 57, 13))))));

        HeadOfDepartmentDTO hod5 = new HeadOfDepartmentDTO("Dr. Ethan Lewis", 61, staff5);
        DepartmentDTO dept5 = new DepartmentDTO();

        List<PortfolioDTO> portfolios5 = new ArrayList<>();
        portfolios5.add(new PortfolioDTO("Housing", 2, dept5));
        portfolios5.add(new PortfolioDTO("Transportation", 2, dept5));

        MinisterDTO minister5 = new MinisterDTO();

        List<MinisterDTO> ministers5 = new ArrayList<>();
        ministers5.add(minister5);

        StateDTO state5 = new StateDTO("New South Wales", "Sydney", ministers5);

        List<StateDTO> states5 = new ArrayList<>();
        states5.add(state5);

        CountryDTO country5 = new CountryDTO("Australia", 100, states5);

        System.out.println(country5);

        System.out.println("6-------------------------------");

        List<StaffDTO> staff6 = new ArrayList<>();
        staff6.add(new StaffDTO("Louis Dubois", "Public Works", new DetailDTO("5.8yrs", 47000, new EducationDTO("MUP", "Sorbonne University", new UniversityDTO("Sorbonne University", 24500, new ChancellorDTO("Dr. Camille Laurent", 61, 16))))));
        staff6.add(new StaffDTO("Camille Morel", "Housing Development", new DetailDTO("4.5yrs", 45000, new EducationDTO("MA", "University of Lyon", new UniversityDTO("University of Lyon", 23500, new ChancellorDTO("Dr. Hugo Lefevre", 60, 15))))));
        staff6.add(new StaffDTO("Lucas Bernard", "Urban Strategy", new DetailDTO("3.9yrs", 43000, new EducationDTO("MBA", "Grenoble University", new UniversityDTO("Grenoble University", 22500, new ChancellorDTO("Dr. Alice Girard", 59, 14))))));
        staff6.add(new StaffDTO("Manon Thomas", "Budget Planning", new DetailDTO("3.3yrs", 41000, new EducationDTO("BA", "Université de Bordeaux", new UniversityDTO("Université de Bordeaux", 22000, new ChancellorDTO("Dr. Nathan Roussel", 58, 13))))));

        HeadOfDepartmentDTO hod6 = new HeadOfDepartmentDTO("Dr. Léa Dubois", 62, staff6);
        DepartmentDTO dept6 = new DepartmentDTO();

        List<PortfolioDTO> portfolios6 = new ArrayList<>();
        portfolios6.add(new PortfolioDTO("Infrastructure", 2, dept6));
        portfolios6.add(new PortfolioDTO("Housing Schemes", 2, dept6));

        MinisterDTO minister6 = new MinisterDTO();

        List<MinisterDTO> ministers6 = new ArrayList<>();
        ministers6.add(minister6);

        StateDTO state6 = new StateDTO("Île-de-France", "Paris", ministers6);

        List<StateDTO> states6 = new ArrayList<>();
        states6.add(state6);

        CountryDTO country6 = new CountryDTO("France", 120, states6);

        System.out.println(country6);

        System.out.println("7-------------------------------");

        List<StaffDTO> staff7 = new ArrayList<>();
        staff7.add(new StaffDTO("Ethan Johnson", "Municipal Services", new DetailDTO("5.6yrs", 49000, new EducationDTO("MA", "University of Toronto", new UniversityDTO("University of Toronto", 25500, new ChancellorDTO("Dr. Olivia Brown", 62, 17))))));
        staff7.add(new StaffDTO("Ava Wilson", "Community Development", new DetailDTO("4.1yrs", 47000, new EducationDTO("MSc", "McGill University", new UniversityDTO("McGill University", 24500, new ChancellorDTO("Dr. Benjamin Clark", 61, 16))))));
        staff7.add(new StaffDTO("Mason Brown", "Infrastructure Planning", new DetailDTO("3.7yrs", 45000, new EducationDTO("MBA", "University of British Columbia", new UniversityDTO("University of British Columbia", 23500, new ChancellorDTO("Dr. Abigail Miller", 60, 15))))));
        staff7.add(new StaffDTO("Sophie Davis", "Public Transport", new DetailDTO("3.1yrs", 43000, new EducationDTO("BA", "University of Alberta", new UniversityDTO("University of Alberta", 22500, new ChancellorDTO("Dr. Logan Wilson", 59, 14))))));

        HeadOfDepartmentDTO hod7 = new HeadOfDepartmentDTO("Dr. William Thompson", 63, staff7);
        DepartmentDTO dept7 = new DepartmentDTO();

        List<PortfolioDTO> portfolios7 = new ArrayList<>();
        portfolios7.add(new PortfolioDTO("Community Development", 2, dept7));
        portfolios7.add(new PortfolioDTO("Public Transport", 2, dept7));

        MinisterDTO minister7 = new MinisterDTO();

        List<MinisterDTO> ministers7 = new ArrayList<>();
        ministers7.add(minister7);

        StateDTO state7 = new StateDTO("Ontario", "Toronto", ministers7);

        List<StateDTO> states7 = new ArrayList<>();
        states7.add(state7);

        CountryDTO country7 = new CountryDTO();

        System.out.println(country7);

        System.out.println("8-------------------------------");


        List<StaffDTO> staff8 = new ArrayList<>();
        staff8.add(new StaffDTO("Lucas Silva", "Water Supply", new DetailDTO("6yrs", 46000, new EducationDTO("MSc", "USP", new UniversityDTO("USP", 21000, new ChancellorDTO("Dr. Fernando Oliveira", 58, 12))))));
        staff8.add(new StaffDTO("Mariana Costa", "Urban Affairs", new DetailDTO("4.8yrs", 44000, new EducationDTO("MBA", "PUC", new UniversityDTO("PUC", 20000, new ChancellorDTO("Dr. Gabriela Souza", 60, 14))))));
        staff8.add(new StaffDTO("João Pereira", "Infrastructure", new DetailDTO("3.5yrs", 43000, new EducationDTO("BEng", "UNICAMP", new UniversityDTO("UNICAMP", 19500, new ChancellorDTO("Dr. Ricardo Lima", 59, 13))))));
        staff8.add(new StaffDTO("Ana Santos", "Housing", new DetailDTO("2.7yrs", 41000, new EducationDTO("BA", "UFRJ", new UniversityDTO("UFRJ", 19000, new ChancellorDTO("Dr. Carla Mendes", 57, 12))))));

        HeadOfDepartmentDTO hod8 = new HeadOfDepartmentDTO("Dr. Rafael Barbosa", 60, staff8);
        DepartmentDTO dept8 = new DepartmentDTO();

        List<PortfolioDTO> portfolios8 = new ArrayList<>();
        portfolios8.add(new PortfolioDTO("Sanitation", 2, dept8));
        portfolios8.add(new PortfolioDTO("Housing Projects", 2, dept8));

        MinisterDTO minister8 = new MinisterDTO();

        List<MinisterDTO> ministers8 = new ArrayList<>();
        ministers8.add(minister8);

        StateDTO state8 = new StateDTO("São Paulo", "São Paulo City", ministers8);

        List<StateDTO> states8 = new ArrayList<>();
        states8.add(state8);

        CountryDTO country8 = new CountryDTO("Brazil", 220, states8);

        System.out.println(country8);

        System.out.println("9-------------------------------");

        List<StaffDTO> staff9 = new ArrayList<>();
        staff9.add(new StaffDTO("Jisoo Kim", "Planning", new DetailDTO("5.5yrs", 47000, new EducationDTO("MA", "Seoul National University", new UniversityDTO("SNU", 26000, new ChancellorDTO("Dr. Minho Choi", 60, 16))))));
        staff9.add(new StaffDTO("Hyunwoo Park", "Public Relations", new DetailDTO("4yrs", 45000, new EducationDTO("MBA", "KAIST", new UniversityDTO("KAIST", 25500, new ChancellorDTO("Dr. Seojin Lee", 58, 15))))));
        staff9.add(new StaffDTO("Yuna Lee", "Finance", new DetailDTO("3.6yrs", 43000, new EducationDTO("BCom", "POSTECH", new UniversityDTO("POSTECH", 25000, new ChancellorDTO("Dr. Jihyun Yoon", 59, 14))))));
        staff9.add(new StaffDTO("Sungmin Choi", "Technology", new DetailDTO("3yrs", 42000, new EducationDTO("BSc", "Yonsei University", new UniversityDTO("Yonsei", 24500, new ChancellorDTO("Dr. Hyejin Kim", 57, 13))))));

        HeadOfDepartmentDTO hod9 = new HeadOfDepartmentDTO("Dr. Donghyun Park", 61, staff9);
        DepartmentDTO dept9 = new DepartmentDTO();

        List<PortfolioDTO> portfolios9 = new ArrayList<>();
        portfolios9.add(new PortfolioDTO("Technology Parks", 2, dept9));
        portfolios9.add(new PortfolioDTO("Digital Policies", 2, dept9));

        MinisterDTO minister9 = new MinisterDTO();

        List<MinisterDTO> ministers9 = new ArrayList<>();
        ministers9.add(minister9);

        StateDTO state9 = new StateDTO("Seoul", "Jongno-gu", ministers9);

        List<StateDTO> states9 = new ArrayList<>();
        states9.add(state9);

        CountryDTO country9 = new CountryDTO("South Korea", 180, states9);

        System.out.println(country9);

        System.out.println("10-------------------------------");

        List<StaffDTO> staff10 = new ArrayList<>();
        staff10.add(new StaffDTO("Giulia Rossi", "Housing", new DetailDTO("6.2yrs", 49000, new EducationDTO("MUP", "Sapienza University", new UniversityDTO("Sapienza", 27000, new ChancellorDTO("Dr. Luca Bianchi", 61, 15))))));
        staff10.add(new StaffDTO("Lorenzo Russo", "Urban Renewal", new DetailDTO("4.5yrs", 47000, new EducationDTO("MA", "University of Milan", new UniversityDTO("University of Milan", 26000, new ChancellorDTO("Dr. Sofia Romano", 60, 14))))));
        staff10.add(new StaffDTO("Matteo Ferrari", "Heritage", new DetailDTO("3.7yrs", 45000, new EducationDTO("BA", "University of Bologna", new UniversityDTO("University of Bologna", 25500, new ChancellorDTO("Dr. Marco Conti", 59, 13))))));
        staff10.add(new StaffDTO("Alessia Ricci", "Transport", new DetailDTO("3.1yrs", 43000, new EducationDTO("BA", "Politecnico di Torino", new UniversityDTO("Politecnico di Torino", 25000, new ChancellorDTO("Dr. Andrea Greco", 57, 12))))));

        HeadOfDepartmentDTO hod10 = new HeadOfDepartmentDTO("Dr. Martina Esposito", 62, staff10);
        DepartmentDTO dept10 = new DepartmentDTO();

        List<PortfolioDTO> portfolios10 = new ArrayList<>();
        portfolios10.add(new PortfolioDTO("Transport Networks", 2, dept10));
        portfolios10.add(new PortfolioDTO("Cultural Development", 2, dept10));

        MinisterDTO minister10 = new MinisterDTO();

        List<MinisterDTO> ministers10 = new ArrayList<>();
        ministers10.add(minister10);

        StateDTO state10 = new StateDTO("Lazio", "Rome", ministers10);

        List<StateDTO> states10 = new ArrayList<>();
        states10.add(state10);

        CountryDTO country10 = new CountryDTO("Italy", 160, states10);

        System.out.println(country10);
    }
}

