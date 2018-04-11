package com.gmail.gm.jcant;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {

		String answer = "";
		Group gr = new Group("PN121");
		gr.addStudent(new Student("Ivanov", "Ivan", 3));
		gr.addStudent(new Student("Petrov", "Petr", 4));
		gr.addStudent(new Student("Sidorov", "Sidor", 5));
		gr.addStudent(new Student("Garbuzov", "Garbus", 1));

		answer += "<html><head><title>Student</title><meta charset='cp1251'></head><body>"
				+ "<p>Список студентов группы: " + gr.getName() + "</p><br>";
		answer += "<table border='2' cellpadding='5'><tr><th>Фамилия</th><th>Имя</th><th>Курс</th></tr>";
		Student[] starr = gr.getGroup();
		for (int i = 0; i < starr.length; i++) {
			answer += "<tr>";
			answer += "<td>" + starr[i].getName() + "</td>";
			answer += "<td>" + starr[i].getLastname() + "</td>";
			answer += "<td>" + starr[i].getCourse() + "</td>";
			answer += "</th>";
		}
		answer += "</table></body></html>";

		try (ServerSocket soc = new ServerSocket(9090)) {
			for (;;) {
				Socket clisok = soc.accept();
				Client cli = new Client(clisok, answer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
