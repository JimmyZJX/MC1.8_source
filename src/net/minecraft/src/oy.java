package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ import org.apache.commons.lang3.StringUtils;
/*  4:   */ 
/*  5:   */ public class oy
/*  6:   */ {
/*  7:52 */   private String a = null;
/*  8:53 */   private final List b = Lists.newArrayList();
/*  9:   */   
/* 10:   */   private void a(String paramString)
/* 11:   */   {
/* 12:59 */     this.b.add(0, paramString);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public String b()
/* 16:   */   {
/* 17:67 */     return StringUtils.join(this.b, "->");
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String toString()
/* 21:   */   {
/* 22:72 */     if (this.a != null)
/* 23:   */     {
/* 24:73 */       if (!this.b.isEmpty()) {
/* 25:74 */         return this.a + " " + b();
/* 26:   */       }
/* 27:76 */       return this.a;
/* 28:   */     }
/* 29:79 */     if (!this.b.isEmpty()) {
/* 30:80 */       return "(Unknown file) " + b();
/* 31:   */     }
/* 32:82 */     return "(Unknown file)";
/* 33:   */   }
			  oy(ox arg0) {}
			  static void a(oy arg0, String arg1) {arg0.a(arg1);}
			  static String b(oy arg0, String arg1) {return arg0.a=arg1;}
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oy
 * JD-Core Version:    0.7.0.1
 */