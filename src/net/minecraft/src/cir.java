package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public class cir
/*  5:   */   extends wa
/*  6:   */   implements vy
/*  7:   */ {
/*  8:   */   private String a;
/*  9:16 */   private Map b = Maps.newHashMap();
/* 10:   */   
/* 11:   */   public cir(String paramString, ho paramho, int paramInt)
/* 12:   */   {
/* 13:19 */     super(paramho, paramInt);
/* 14:20 */     this.a = paramString;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a_(int paramInt)
/* 18:   */   {
/* 19:25 */     if (this.b.containsKey(Integer.valueOf(paramInt))) {
/* 20:26 */       return ((Integer)this.b.get(Integer.valueOf(paramInt))).intValue();
/* 21:   */     }
/* 22:28 */     return 0;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void b(int paramInt1, int paramInt2)
/* 26:   */   {
/* 27:33 */     this.b.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
/* 28:   */   }
/* 29:   */   
/* 30:   */   public int g()
/* 31:   */   {
/* 32:40 */     return this.b.size();
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean q_()
/* 36:   */   {
/* 37:45 */     return false;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(vx paramvx) {}
/* 41:   */   
/* 42:   */   public vx i()
/* 43:   */   {
/* 44:54 */     return vx.a;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public String k()
/* 48:   */   {
/* 49:63 */     return this.a;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public aib a(Inventory paramahb, EntityPlayer paramahd)
/* 53:   */   {
/* 54:68 */     throw new UnsupportedOperationException();
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cir
 * JD-Core Version:    0.7.0.1
 */