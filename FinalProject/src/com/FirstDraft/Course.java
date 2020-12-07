package com.FirstDraft;

import java.util.ArrayList;
import java.util.Calendar;
public class Course {
	private int courseID;
	private String courseName;
	private Employee courseTrainer;
	private ArrayList<Integer> preRequisites;
	private int duration;
	private Calendar startDate;
	private Calendar endDate;
	private ArrayList<Calendar> timings;
	private String url;
}
