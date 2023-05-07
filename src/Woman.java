public class Woman extends Person{
    private String partnerLastName;
    public Woman (String firstName,String lastName,Integer age,String partner,String profession,String partnerLastName){
        super(firstName,lastName,age,partner,profession);
    }
    @Override
    public String getPartnerLastName() {
        return partnerLastName;
    }

    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }
}
