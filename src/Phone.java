public interface Phone {

    void powerOn();
    void callNumber(String PhoneNo);
    void receiveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();

}
