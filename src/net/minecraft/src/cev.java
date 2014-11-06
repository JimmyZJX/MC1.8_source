package net.minecraft.src;

import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class cev {
	private final String a;
	private final int b;

	private cev(String paramString, int paramInt) {
		this.a = paramString;
		this.b = paramInt;
	}

	public String a() {
		return IDN.toASCII(this.a);
	}

	public int b() {
		return this.b;
	}

	public static cev a(String paramString) {
		if (paramString == null) {
			return null;
		}
		String[] arrayOfString = paramString.split(":");
		String localObject;
		if (paramString.startsWith("[")) {
			int i = paramString.indexOf("]");
			if (i > 0) {
				String str2 = paramString.substring(1, i);
				localObject = paramString.substring(i + 1).trim();
				if ((((String) localObject).startsWith(":"))
						&& (((String) localObject).length() > 0)) {
					localObject = ((String) localObject).substring(1);
					arrayOfString = new String[2];
					arrayOfString[0] = str2;
					arrayOfString[1] = localObject;
				} else {
					arrayOfString = new String[1];
					arrayOfString[0] = str2;
				}
			}
		}
		if (arrayOfString.length > 2) {
			arrayOfString = new String[1];
			arrayOfString[0] = paramString;
		}
		String str1 = arrayOfString[0];
		int j = arrayOfString.length > 1 ? a(arrayOfString[1], 25565) : 25565;
		if (j == 25565) {
			String[] localObject1 = b(str1);
			str1 = localObject1[0];
			j = a(localObject1[1], 25565);
		}
		return new cev(str1, j);
	}

	private static String[] b(String paramString) {
		try {
			String str = "com.sun.jndi.dns.DnsContextFactory";

			Class.forName("com.sun.jndi.dns.DnsContextFactory");

			Hashtable<String,String> localHashtable = new Hashtable<String,String>();
			localHashtable.put("java.naming.factory.initial",
					"com.sun.jndi.dns.DnsContextFactory");
			localHashtable.put("java.naming.provider.url", "dns:");
			localHashtable.put("com.sun.jndi.dns.timeout.retries", "1");
			InitialDirContext localInitialDirContext = new InitialDirContext(
					localHashtable);
			Attributes localAttributes = localInitialDirContext.getAttributes(
					"_minecraft._tcp." + paramString, new String[] { "SRV" });
			String[] arrayOfString = localAttributes.get("srv").get()
					.toString().split(" ", 4);
			return new String[] { arrayOfString[3], arrayOfString[2] };
		} catch (Throwable localThrowable) {
		}
		return new String[0];//return tmp142_138;
	}

	private static int a(String paramString, int paramInt) {
		try {
			return Integer.parseInt(paramString.trim());
		} catch (Exception localException) {
		}
		return paramInt;
	}
}

/*
 * Location: C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * 
 * Qualified Name: cev
 * 
 * JD-Core Version: 0.7.0.1
 */