package api.tistech.service;

import org.springframework.stereotype.Service;

@Service
public class TerceiroInteiroService {

	public int criaTerceiroInteiro(int a, int b) {
		String aStr = "", bStr = "", cStr = "";
		int c = 0;
		
		if (a+b <=0)
			return 0;
		
		if (a>0)
			aStr = ""+a;
		if (b>0)
			bStr = ""+b;
		
		cStr = concatenaAlternado(aStr, bStr);

		c = Integer.parseInt(cStr);

		if (c >= 1000000) 
			return -1;
		
		return c;
	}
	
	public String concatenaAlternado(String a, String b) {
		
		if (a.isEmpty()) return b;
		if (b.isEmpty()) return a;
		return a.charAt(0)+""+b.charAt(0)+""+concatenaAlternado(a.substring(1), b.substring(1));
	}
}
