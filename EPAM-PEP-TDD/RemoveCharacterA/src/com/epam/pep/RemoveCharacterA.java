package com.epam.pep;

public class RemoveCharacterA {
		public String remove(String string) {
			char frstChar = string.charAt(0);
			char secondChar = string.charAt(1);
			if(frstChar =='A' && secondChar == 'A') {
				return string.substring(2, string.length());
			}
			if(frstChar =='A') {
				return string.substring(1, string.length());
			}
			if(secondChar == 'A') {
				return string.charAt(0)+string.substring(2, string.length());
			}
			return string;
		}
}
