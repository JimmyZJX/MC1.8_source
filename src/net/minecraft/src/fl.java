package net.minecraft.src;
/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
import java.io.IOException;
/*  3:   */ import java.util.Arrays;
/*  4:   */ 
/*  5:   */ public class fl
/*  6:   */   extends NBTBase
/*  7:   */ {
/*  8:   */   private byte[] b;
/*  9:   */   
/* 10:   */   fl() {}
/* 11:   */   
/* 12:   */   public fl(byte[] paramArrayOfByte)
/* 13:   */   {
/* 14:15 */     this.b = paramArrayOfByte;
/* 15:   */   }
/* 16:   */   
/* 17:   */   void a(DataOutput paramDataOutput) throws IOException
/* 18:   */   {
/* 19:20 */     paramDataOutput.writeInt(this.b.length);
/* 20:21 */     paramDataOutput.write(this.b);
/* 21:   */   }
/* 22:   */   
/* 23:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 24:   */   {
/* 25:26 */     int i = paramDataInput.readInt();
/* 26:27 */     paramfx.a(8 * i);
/* 27:28 */     this.b = new byte[i];
/* 28:29 */     paramDataInput.readFully(this.b);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public byte a()
/* 32:   */   {
/* 33:34 */     return 7;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String toString()
/* 37:   */   {
/* 38:39 */     return "[" + this.b.length + " bytes]";
/* 39:   */   }
/* 40:   */   
/* 41:   */   public NBTBase b()
/* 42:   */   {
/* 43:44 */     byte[] arrayOfByte = new byte[this.b.length];
/* 44:45 */     System.arraycopy(this.b, 0, arrayOfByte, 0, this.b.length);
/* 45:46 */     return new fl(arrayOfByte);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean equals(Object paramObject)
/* 49:   */   {
/* 50:51 */     if (super.equals(paramObject)) {
/* 51:52 */       return Arrays.equals(this.b, ((fl)paramObject).b);
/* 52:   */     }
/* 53:54 */     return false;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public int hashCode()
/* 57:   */   {
/* 58:59 */     return super.hashCode() ^ Arrays.hashCode(this.b);
/* 59:   */   }
/* 60:   */   
/* 61:   */   public byte[] c()
/* 62:   */   {
/* 63:63 */     return this.b;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fl
 * JD-Core Version:    0.7.0.1
 */