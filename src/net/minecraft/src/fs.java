package net.minecraft.src;
/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
import java.io.IOException;
/*  3:   */ 
/*  4:   */ public class fs
/*  5:   */   extends ge
/*  6:   */ {
/*  7:   */   private float b;
/*  8:   */   
/*  9:   */   fs() {}
/* 10:   */   
/* 11:   */   public fs(float paramFloat)
/* 12:   */   {
/* 13:17 */     this.b = paramFloat;
/* 14:   */   }
/* 15:   */   
/* 16:   */   void a(DataOutput paramDataOutput) throws IOException
/* 17:   */   {
/* 18:22 */     paramDataOutput.writeFloat(this.b);
/* 19:   */   }
/* 20:   */   
/* 21:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 22:   */   {
/* 23:27 */     paramfx.a(32L);
/* 24:28 */     this.b = paramDataInput.readFloat();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public byte a()
/* 28:   */   {
/* 29:33 */     return 5;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String toString()
/* 33:   */   {
/* 34:38 */     return "" + this.b + "f";
/* 35:   */   }
/* 36:   */   
/* 37:   */   public NBTBase b()
/* 38:   */   {
/* 39:43 */     return new fs(this.b);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean equals(Object paramObject)
/* 43:   */   {
/* 44:48 */     if (super.equals(paramObject))
/* 45:   */     {
/* 46:49 */       fs localfs = (fs)paramObject;
/* 47:50 */       return this.b == localfs.b;
/* 48:   */     }
/* 49:52 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int hashCode()
/* 53:   */   {
/* 54:57 */     return super.hashCode() ^ Float.floatToIntBits(this.b);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public long c()
/* 58:   */   {
/* 59:62 */     return (long)this.b;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public int d()
/* 63:   */   {
/* 64:67 */     return MathUtils.floor(this.b);
/* 65:   */   }
/* 66:   */   
/* 67:   */   public short e()
/* 68:   */   {
/* 69:72 */     return (short)(MathUtils.floor(this.b) & 0xFFFF);
/* 70:   */   }
/* 71:   */   
/* 72:   */   public byte f()
/* 73:   */   {
/* 74:77 */     return (byte)(MathUtils.floor(this.b) & 0xFF);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public double g()
/* 78:   */   {
/* 79:82 */     return this.b;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public float h()
/* 83:   */   {
/* 84:87 */     return this.b;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fs
 * JD-Core Version:    0.7.0.1
 */