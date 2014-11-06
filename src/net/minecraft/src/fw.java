package net.minecraft.src;
/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
import java.io.IOException;
/*  3:   */ 
/*  4:   */ public class fw
/*  5:   */   extends ge
/*  6:   */ {
/*  7:   */   private long b;
/*  8:   */   
/*  9:   */   fw() {}
/* 10:   */   
/* 11:   */   public fw(long paramLong)
/* 12:   */   {
/* 13:16 */     this.b = paramLong;
/* 14:   */   }
/* 15:   */   
/* 16:   */   void a(DataOutput paramDataOutput) throws IOException
/* 17:   */   {
/* 18:21 */     paramDataOutput.writeLong(this.b);
/* 19:   */   }
/* 20:   */   
/* 21:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 22:   */   {
/* 23:26 */     paramfx.a(64L);
/* 24:27 */     this.b = paramDataInput.readLong();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public byte a()
/* 28:   */   {
/* 29:32 */     return 4;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String toString()
/* 33:   */   {
/* 34:37 */     return "" + this.b + "L";
/* 35:   */   }
/* 36:   */   
/* 37:   */   public NBTBase b()
/* 38:   */   {
/* 39:42 */     return new fw(this.b);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean equals(Object paramObject)
/* 43:   */   {
/* 44:47 */     if (super.equals(paramObject))
/* 45:   */     {
/* 46:48 */       fw localfw = (fw)paramObject;
/* 47:49 */       return this.b == localfw.b;
/* 48:   */     }
/* 49:51 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int hashCode()
/* 53:   */   {
/* 54:56 */     return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public long c()
/* 58:   */   {
/* 59:61 */     return this.b;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public int d()
/* 63:   */   {
/* 64:66 */     return (int)(this.b & 0xFFFFFFFF);
/* 65:   */   }
/* 66:   */   
/* 67:   */   public short e()
/* 68:   */   {
/* 69:71 */     return (short)(int)(this.b & 0xFFFF);
/* 70:   */   }
/* 71:   */   
/* 72:   */   public byte f()
/* 73:   */   {
/* 74:76 */     return (byte)(int)(this.b & 0xFF);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public double g()
/* 78:   */   {
/* 79:81 */     return this.b;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public float h()
/* 83:   */   {
/* 84:86 */     return (float)this.b;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fw
 * JD-Core Version:    0.7.0.1
 */