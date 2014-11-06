package net.minecraft.src;
/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
import java.io.IOException;
/*  3:   */ 
/*  4:   */ public class gc
/*  5:   */   extends NBTBase
/*  6:   */ {
/*  7:   */   private String b;
/*  8:   */   
/*  9:   */   public gc()
/* 10:   */   {
/* 11:11 */     this.b = "";
/* 12:   */   }
/* 13:   */   
/* 14:   */   public gc(String paramString)
/* 15:   */   {
/* 16:15 */     this.b = paramString;
/* 17:16 */     if (paramString == null) {
/* 18:17 */       throw new IllegalArgumentException("Empty string not allowed");
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   void a(DataOutput paramDataOutput) throws IOException
/* 23:   */   {
/* 24:23 */     paramDataOutput.writeUTF(this.b);
/* 25:   */   }
/* 26:   */   
/* 27:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 28:   */   {
/* 29:28 */     this.b = paramDataInput.readUTF();
/* 30:29 */     paramfx.a(16 * this.b.length());
/* 31:   */   }
/* 32:   */   
/* 33:   */   public byte a()
/* 34:   */   {
/* 35:34 */     return 8;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String toString()
/* 39:   */   {
/* 40:39 */     return "\"" + this.b.replace("\"", "\\\"") + "\"";
/* 41:   */   }
/* 42:   */   
/* 43:   */   public NBTBase b()
/* 44:   */   {
/* 45:44 */     return new gc(this.b);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean c_()
/* 49:   */   {
/* 50:49 */     return this.b.isEmpty();
/* 51:   */   }
/* 52:   */   
/* 53:   */   public boolean equals(Object paramObject)
/* 54:   */   {
/* 55:54 */     if (super.equals(paramObject))
/* 56:   */     {
/* 57:55 */       gc localgc = (gc)paramObject;
/* 58:56 */       return ((this.b == null) && (localgc.b == null)) || ((this.b != null) && (this.b.equals(localgc.b)));
/* 59:   */     }
/* 60:58 */     return false;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public int hashCode()
/* 64:   */   {
/* 65:63 */     return super.hashCode() ^ this.b.hashCode();
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String a_()
/* 69:   */   {
/* 70:68 */     return this.b;
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gc
 * JD-Core Version:    0.7.0.1
 */