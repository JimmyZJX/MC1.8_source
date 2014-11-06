package net.minecraft.src;
/*   1:    */ import java.io.IOException;
/*   2:    */ import java.net.DatagramPacket;
/*   3:    */ import java.net.DatagramSocket;
/*   4:    */ import java.net.InetAddress;
import java.net.SocketException;
/*   5:    */ import java.util.concurrent.atomic.AtomicInteger;

/*   6:    */ import org.apache.logging.log4j.LogManager;
/*   7:    */ import org.apache.logging.log4j.Logger;
/*   8:    */ 
/*   9:    */ public class cyt
/*  10:    */   extends Thread
/*  11:    */ {
/*  12: 13 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  13: 14 */   private static final Logger b = LogManager.getLogger();
/*  14:    */   private final String c;
/*  15:    */   private final DatagramSocket d;
/*  16: 22 */   private boolean e = true;
/*  17:    */   private final String f;
/*  18:    */   
/*  19:    */   public cyt(String paramString1, String paramString2) throws SocketException
/*  20:    */   {
/*  21: 26 */     super("LanServerPinger #" + a.incrementAndGet());
/*  22: 27 */     this.c = paramString1;
/*  23: 28 */     this.f = paramString2;
/*  24: 29 */     setDaemon(true);
/*  25:    */     
/*  26: 31 */     this.d = new DatagramSocket();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void run()
/*  30:    */   {
/*  31: 36 */     String str = a(this.c, this.f);
/*  32: 37 */     byte[] arrayOfByte = str.getBytes();
/*  33: 39 */     while ((!isInterrupted()) && (this.e))
/*  34:    */     {
/*  35:    */       try
/*  36:    */       {
/*  37: 41 */         InetAddress localInetAddress = InetAddress.getByName("224.0.2.60");
/*  38:    */         
/*  39: 43 */         DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, localInetAddress, 4445);
/*  40: 44 */         this.d.send(localDatagramPacket);
/*  41:    */       }
/*  42:    */       catch (IOException localIOException)
/*  43:    */       {
/*  44: 46 */         b.warn("LanServerPinger: " + localIOException.getMessage());
/*  45: 47 */         break;
/*  46:    */       }
/*  47:    */       try
/*  48:    */       {
/*  49: 51 */         sleep(1500L);
/*  50:    */       }
/*  51:    */       catch (InterruptedException localInterruptedException) {}
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void interrupt()
/*  56:    */   {
/*  57: 59 */     super.interrupt();
/*  58:    */     
/*  59:    */ 
/*  60: 62 */     this.e = false;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static String a(String paramString1, String paramString2)
/*  64:    */   {
/*  65: 66 */     return "[MOTD]" + paramString1 + "[/MOTD][AD]" + paramString2 + "[/AD]";
/*  66:    */   }
/*  67:    */   
/*  68:    */   public static String a(String paramString)
/*  69:    */   {
/*  70: 70 */     int i = paramString.indexOf("[MOTD]");
/*  71: 71 */     if (i < 0) {
/*  72: 72 */       return "missing no";
/*  73:    */     }
/*  74: 74 */     int j = paramString.indexOf("[/MOTD]", i + "[MOTD]".length());
/*  75: 75 */     if (j < i) {
/*  76: 76 */       return "missing no";
/*  77:    */     }
/*  78: 78 */     return paramString.substring(i + "[MOTD]".length(), j);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public static String b(String paramString)
/*  82:    */   {
/*  83: 82 */     int i = paramString.indexOf("[/MOTD]");
/*  84: 83 */     if (i < 0) {
/*  85: 84 */       return null;
/*  86:    */     }
/*  87: 87 */     int j = paramString.indexOf("[/MOTD]", i + "[/MOTD]".length());
/*  88: 88 */     if (j >= 0) {
/*  89: 90 */       return null;
/*  90:    */     }
/*  91: 93 */     int k = paramString.indexOf("[AD]", i + "[/MOTD]".length());
/*  92: 94 */     if (k < 0) {
/*  93: 95 */       return null;
/*  94:    */     }
/*  95: 97 */     int m = paramString.indexOf("[/AD]", k + "[AD]".length());
/*  96: 98 */     if (m < k) {
/*  97: 99 */       return null;
/*  98:    */     }
/*  99:101 */     return paramString.substring(k + "[AD]".length(), m);
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyt
 * JD-Core Version:    0.7.0.1
 */