package net.minecraft.src;
/*   1:    */ import java.awt.image.BufferedImage;
/*   2:    */ import java.io.Closeable;
/*   3:    */ import java.io.File;
/*   4:    */ import java.io.IOException;
/*   5:    */ import org.apache.commons.io.IOUtils;
/*   6:    */ 
/*   7:    */ public class cvs
/*   8:    */ {
/*   9:    */   private final File b;
/*  10:    */   private cvm c;
/*  11:    */   private cwx d;
/*  12:    */   private BufferedImage e;
/*  13:    */   private oa f;
				private final cvo a;
/*  14:    */   
/*  15:    */   private cvs(cvo paramcvo, File paramFile)
/*  16:    */   {
/*  17:246 */     this.b = paramFile;
				  a=paramcvo;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a() throws IOException
/*  21:    */   {
/*  22:250 */     this.c = (this.b.isDirectory() ? new cvf(this.b) : new cve(this.b));
/*  23:    */     
/*  24:252 */     this.d = ((cwx)this.c.a(this.a.b, "pack"));
/*  25:    */     try
/*  26:    */     {
/*  27:254 */       this.e = this.c.a();
/*  28:    */     }
/*  29:    */     catch (IOException localIOException) {}
/*  30:257 */     if (this.e == null) {
/*  31:258 */       this.e = this.a.a.a();
/*  32:    */     }
/*  33:261 */     b();
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void a(cug paramcug)
/*  37:    */   {
/*  38:265 */     if (this.f == null) {
/*  39:266 */       this.f = paramcug.a("texturepackicon", new ctp(this.e));
/*  40:    */     }
/*  41:268 */     paramcug.a(this.f);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void b()
/*  45:    */   {
/*  46:272 */     if ((this.c instanceof Closeable)) {
/*  47:273 */       IOUtils.closeQuietly((Closeable)this.c);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public cvm c()
/*  52:    */   {
/*  53:278 */     return this.c;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String d()
/*  57:    */   {
/*  58:282 */     return this.c.b();
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String e()
/*  62:    */   {
/*  63:286 */     return this.d == null ? net.minecraft.src.a.m + "Invalid pack.mcmeta (or missing 'pack' section)" : this.d.a().d();
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean equals(Object paramObject)
/*  67:    */   {
/*  68:295 */     if (this == paramObject) {
/*  69:296 */       return true;
/*  70:    */     }
/*  71:299 */     if ((paramObject instanceof cvs)) {
/*  72:300 */       return toString().equals(paramObject.toString());
/*  73:    */     }
/*  74:303 */     return false;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public int hashCode()
/*  78:    */   {
/*  79:308 */     return toString().hashCode();
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String toString()
/*  83:    */   {
/*  84:313 */     return String.format("%s:%s:%d", new Object[] { this.b.getName(), this.b.isDirectory() ? "folder" : "zip", Long.valueOf(this.b.lastModified()) });
/*  85:    */   }
				cvs(cvo arg0, File arg1, cvp arg2) {this(arg0,arg1);}
/*  86:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvs
 * JD-Core Version:    0.7.0.1
 */