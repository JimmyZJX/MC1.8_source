package net.minecraft.src;
/*   1:    */ import java.io.IOException;
/*   2:    */ import java.net.DatagramPacket;
/*   3:    */ import java.net.InetAddress;
/*   4:    */ import java.net.MulticastSocket;
/*   5:    */ import java.net.SocketTimeoutException;
/*   8:    */ 
/*   9:    */ public class cyr
/*  10:    */   extends Thread
/*  11:    */ {
/*  12:    */   private final cys a;
/*  13:    */   private final InetAddress b;
/*  14:    */   private final MulticastSocket c;
/*  15:    */   
/*  16:    */   public cyr(cys paramcys) throws IOException
/*  17:    */   {
/*  18: 97 */     super("LanServerDetector #" + cyp.a().incrementAndGet());
/*  19: 98 */     this.a = paramcys;
/*  20: 99 */     setDaemon(true);
/*  21:    */     
/*  22:101 */     this.c = new MulticastSocket(4445);
/*  23:102 */     this.b = InetAddress.getByName("224.0.2.60");
/*  24:103 */     this.c.setSoTimeout(5000);
/*  25:104 */     this.c.joinGroup(this.b);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void run()
/*  29:    */   {
/*  30:110 */     byte[] arrayOfByte = new byte[1024];
/*  31:112 */     while (!isInterrupted())
/*  32:    */     {
/*  33:113 */       DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
/*  34:    */       try
/*  35:    */       {
/*  36:115 */         this.c.receive(localDatagramPacket);
/*  37:    */       }
/*  38:    */       catch (SocketTimeoutException localSocketTimeoutException)
/*  39:    */       {
/*  40:    */         continue;
/*  41:    */       }
/*  42:    */       catch (IOException localIOException1)
/*  43:    */       {
/*  44:119 */         cyp.b().error("Couldn't ping server", localIOException1);
/*  45:120 */         break;
/*  46:    */       }
/*  47:123 */       String str = new String(localDatagramPacket.getData(), localDatagramPacket.getOffset(), localDatagramPacket.getLength());
/*  48:124 */       cyp.b().debug(localDatagramPacket.getAddress() + ": " + str);
/*  49:125 */       this.a.a(str, localDatagramPacket.getAddress());
/*  50:    */     }
/*  51:    */     try
/*  52:    */     {
/*  53:129 */       this.c.leaveGroup(this.b);
/*  54:    */     }
/*  55:    */     catch (IOException localIOException2) {}
/*  56:132 */     this.c.close();
/*  57:    */   }
/*  58:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyr
 * JD-Core Version:    0.7.0.1
 */