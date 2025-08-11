package com.xworkz.Task;

    // Main.java
    public class Main {
        public static void main(String[] args) {
            // Create instances of the required objects
            PrimeMinister primeMinister = new PrimeMinister("Narendra Modi");

            PersonalAssistant assistant1 = new PersonalAssistant("Amit Shah");
            PersonalAssistant assistant2 = new PersonalAssistant("Rajnath Singh");

            Portfolio portfolio1 = new Portfolio("Finance");
            Portfolio portfolio2 = new Portfolio("Defense");

            Minister[] ministers = {
                    new Minister("Minister 1", new Portfolio[]{portfolio1}, new PersonalAssistant[]{assistant1}),
                    new Minister("Minister 2", new Portfolio[]{portfolio2}, new PersonalAssistant[]{assistant2})
            };

            Room room1 = new Room("Living Room");
            Room room2 = new Room("Bedroom");

            Detail transportDetail = new Detail("Car");
            Transport transport = new Transport(transportDetail);

            HouseKeep houseKeep = new HouseKeep(transport);

            House house = new House(new Room[]{room1, room2}, new HouseKeep[]{houseKeep});

            Company company = new Company("Google");
            Education education = new Education("BTech");
            ExperienceDetail experienceDetail = new ExperienceDetail(company, new Education[]{education});
            Experience experience = new Experience(new ExperienceDetail[]{experienceDetail});
            Skill skill = new Skill("Programming", new Experience[]{experience});
            Personnel personnel = new Personnel("Security 1", new Skill[]{skill});

            Security security = new Security(new Personnel[]{personnel});

            Ward ward1 = new Ward("Ward 1");
            Ward ward2 = new Ward("Ward 2");
            City city1 = new City("City 1", new Ward[]{ward1, ward2});

            District district1 = new District("District 1", new Ward[]{ward1});
            District district2 = new District("District 2", new Ward[]{ward2});

            State state1 = new State("State 1", new District[]{district1}, new City[]{city1});
            State state2 = new State("State 2", new District[]{district2}, new City[]{city1});

            Country country = new Country("India", primeMinister, ministers, new State[]{state1, state2}, security, house);

            country.display();
        }
    }

