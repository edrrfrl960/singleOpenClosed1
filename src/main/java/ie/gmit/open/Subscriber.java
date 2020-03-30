package ie.gmit.open;

/*
 * AUTHOR: Darragh Freeley
 * LAST MODIFIED: 30/03/2020
 * DESCRIPTION: Subscriber extends its methods to PhoneSubscriber and ISPSubscriber.(Open-Closed Example)
 */

    //base class - closed for modification
    public abstract class Subscriber {

        protected Long subscriberId;

        protected String address;

        protected Long phoneNumber;

        protected int baseRate;

        public Long getSubscriberId(){
            return subscriberId;
        }

        public void setSubscriberId(Long subscriberId) {
            this.subscriberId = subscriberId;
        }

        public String getAddress(){
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Long getPhoneNumber(){
            return phoneNumber;
        }

        public void setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getBaseRate(){
            return baseRate;
        }

        public void setBaseRate(int baseRate) {
            this.baseRate = baseRate;
        }

        public abstract double calculateBill(); //extension
        //Open for change.

}
