public class Landline implements Phone{

    private String myNum;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myNum) {
        this.myNum = myNum;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyNum() {
        return myNum;
    }

    public void setMyNum(String myNum) {
        this.myNum = myNum;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String PhoneNo) {
        if(isPowerOn){
            System.out.println("You're dialing the No : "+PhoneNo);
        }
        else{
            System.out.println("Your Landline is Off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {
         if(isPowerOn && myNum.equals(phoneNo)){
             this.isRinging=true;
             System.out.println("Hey,"+myNum+" You're receiving a call");
         }
         else{
             System.out.println("Wrong Number");
         }
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
