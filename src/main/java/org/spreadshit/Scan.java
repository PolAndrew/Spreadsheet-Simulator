package org.spreadshit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scan {

	public static String scStr() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return str;

	}

}
