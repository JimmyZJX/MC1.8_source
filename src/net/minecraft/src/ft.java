package net.minecraft.src;
/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
import java.io.IOException;
/*  3:   */ import java.util.Arrays;
/*  4:   */ 
/*  5:   */ public class ft
/*  6:   */   extends NBTBase
/*  7:   */ {
/*  8:   */   private int[] b;
/*  9:   */   
/* 10:   */   ft() {}
/* 11:   */   
/* 12:   */   public ft(int[] paramArrayOfInt)
/* 13:   */   {
/* 14:15 */     this.b = paramArrayOfInt;
/* 15:   */   }
/* 16:   */   
/* 17:   */   void a(DataOutput paramDataOutput) throws IOException
/* 18:   */   {
/* 19:20 */     paramDataOutput.writeInt(this.b.length);
/* 20:21 */     for (int i = 0; i < this.b.length; i++) {
/* 21:22 */       paramDataOutput.writeInt(this.b[i]);
/* 22:   */     }
/* 23:   */   }
/* 24:   */   
/* 25:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 26:   */   {
/* 27:28 */     int i = paramDataInput.readInt();
/* 28:29 */     paramfx.a(32 * i);
/* 29:30 */     this.b = new int[i];
/* 30:31 */     for (int j = 0; j < i; j++) {
/* 31:32 */       this.b[j] = paramDataInput.readInt();
/* 32:   */     }
/* 33:   */   }
/* 34:   */   
/* 35:   */   public byte a()
/* 36:   */   {
/* 37:38 */     return 11;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String toString()
/* 41:   */   {
/* 42:43 */     String str = "[";
/* 43:44 */     for (int k : this.b) {
/* 44:45 */       str = str + k + ",";
/* 45:   */     }
/* 46:47 */     return str + "]";
/* 47:   */   }
/* 48:   */   
/* 49:   */   public NBTBase b()
/* 50:   */   {
/* 51:52 */     int[] arrayOfInt = new int[this.b.length];
/* 52:53 */     System.arraycopy(this.b, 0, arrayOfInt, 0, this.b.length);
/* 53:54 */     return new ft(arrayOfInt);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public boolean equals(Object paramObject)
/* 57:   */   {
/* 58:59 */     if (super.equals(paramObject)) {
/* 59:60 */       return Arrays.equals(this.b, ((ft)paramObject).b);
/* 60:   */     }
/* 61:62 */     return false;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public int hashCode()
/* 65:   */   {
/* 66:67 */     return super.hashCode() ^ Arrays.hashCode(this.b);
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int[] c()
/* 70:   */   {
/* 71:71 */     return this.b;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ft
 * JD-Core Version:    0.7.0.1
 */