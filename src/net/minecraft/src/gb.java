package net.minecraft.src;
/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
import java.io.IOException;
/*  3:   */ 
/*  4:   */ public class gb
/*  5:   */   extends ge
/*  6:   */ {
/*  7:   */   private short b;
/*  8:   */   
/*  9:   */   public gb() {}
/* 10:   */   
/* 11:   */   public gb(short paramShort)
/* 12:   */   {
/* 13:16 */     this.b = paramShort;
/* 14:   */   }
/* 15:   */   
/* 16:   */   void a(DataOutput paramDataOutput) throws IOException
/* 17:   */   {
/* 18:21 */     paramDataOutput.writeShort(this.b);
/* 19:   */   }
/* 20:   */   
/* 21:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 22:   */   {
/* 23:26 */     paramfx.a(16L);
/* 24:27 */     this.b = paramDataInput.readShort();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public byte a()
/* 28:   */   {
/* 29:32 */     return 2;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String toString()
/* 33:   */   {
/* 34:37 */     return "" + this.b + "s";
/* 35:   */   }
/* 36:   */   
/* 37:   */   public NBTBase b()
/* 38:   */   {
/* 39:42 */     return new gb(this.b);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean equals(Object paramObject)
/* 43:   */   {
/* 44:47 */     if (super.equals(paramObject))
/* 45:   */     {
/* 46:48 */       gb localgb = (gb)paramObject;
/* 47:49 */       return this.b == localgb.b;
/* 48:   */     }
/* 49:51 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int hashCode()
/* 53:   */   {
/* 54:56 */     return super.hashCode() ^ this.b;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public long c()
/* 58:   */   {
/* 59:61 */     return this.b;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public int d()
/* 63:   */   {
/* 64:66 */     return this.b;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public short e()
/* 68:   */   {
/* 69:71 */     return this.b;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public byte f()
/* 73:   */   {
/* 74:76 */     return (byte)(this.b & 0xFF);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public double g()
/* 78:   */   {
/* 79:81 */     return this.b;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public float h()
/* 83:   */   {
/* 84:86 */     return this.b;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gb
 * JD-Core Version:    0.7.0.1
 */