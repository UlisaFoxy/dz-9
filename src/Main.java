public class Main {
    public static void main(String[] args) {
        Man man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter" );
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith");
        System.out.println(isRetired(man));
        System.out.println(isRetired(woman));


    }

    public static boolean isRetired(Person person) {
        int retirementAge = (person instanceof Woman) ? 60 : 65;
        return person.getAge() >= retirementAge;
    }


    public static void changeWomanLastName(Man man, Woman woman) {
        if (!man.getLastName().equals(woman.getLastName())) {
            woman.setLastName(woman.getPartnerLastName());

        }
    }


}