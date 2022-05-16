package statisticker;

public class EmailAlert implements IAlerter {

public boolean emailSent=false;


@Override
public void setEmailSent(boolean emailSent){
this.emailSent=emailSent;
}


@Override
public void setLedGlows(boolean ledGlows){
// default implementation
}



}
