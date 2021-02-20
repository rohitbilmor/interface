package com.Interfaces;
class Phone
{
	void Icall()
	{
		System.out.println("Make a call");
	}
	void Isms()
	{
		System.out.println("Send sms");
	}
}
interface Camera
{
	void click();
	void record();
}
interface MusicPlayer
{
	void play();
	void pause();
}
class Smartphone extends Phone implements Camera,MusicPlayer
{
	public void browse()
	{
		System.out.println("Browsing");
	}
	public void click()
	{
		System.out.println("Clicked photo");
	}
	public void record()
	{
		System.out.println("Recording");
	}
	public void play()
	{
		System.out.println("Playing");
	}
	public void pause()
	{
		System.out.println("paused");
	}
	
}
public class Smartphone_Interface {

	public static void main(String[] args) {
		Smartphone s=new Smartphone();
		Camera c=s;
		Phone p=s;
		MusicPlayer mp=s;
		s.browse();
		c.click();
		p.Icall();
		mp.pause();
	}

}
