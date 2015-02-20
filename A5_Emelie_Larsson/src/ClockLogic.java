import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ClockLogic implements ClockInterface{

	public String time= "";
	private DigitalClockGUI clockGUI;
	private int alarmMinute;
	private int alarmHour;
	private int hours;
	private int minutes;


	public ClockLogic (DigitalClockGUI clockIn){
		this.clockGUI = clockIn;
		Thread t = new Thread(new ClockThread(this));
		t.start();
	}

	public void setAlarm(int hours, int minutes){
		this.alarmMinute = minutes;
		this.alarmHour = hours;
	}

	public void clearAlarm(){
		this.alarmHour = 2000;
		this.alarmMinute = 2000;

	}

	@Override
	public void update(int hours, int minutes, int seconds) {

		System.out.println("updatering");


		if (alarmHour == hours && alarmMinute == minutes){

			System.out.println("alarm");

			clockGUI.textField_3.setText("ALARM!!!");

		}
		
		clockGUI.setTimeOnLabel(addZeros(hours)+ ":" + addZeros(minutes)+ ":" + addZeros(seconds));
		
	}
	
	private String addZeros(int i){
		String s = String.valueOf(i);
		if (s.length()==1){
			s="0" + s;
			
		}
		
		return s;
		
		
	}
	
}


