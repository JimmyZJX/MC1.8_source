package net.minecraft.src;
/*  1:   */ import com.google.common.collect.ImmutableSet;
/*  2:   */ import java.util.Collection;
/*  3:   */ 
/*  4:   */ public class bet
/*  5:   */   extends bes<Boolean>
/*  6:   */ {
/*  7:   */   private final ImmutableSet a;
/*  8:   */   
/*  9:   */   protected bet(String paramString)
/* 10:   */   {
/* 11:11 */     super(paramString, Boolean.class);
/* 12:12 */     this.a = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));
/* 13:   */   }
/* 14:   */   
/* 15:   */   public Collection c()
/* 16:   */   {
/* 17:17 */     return this.a;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static bet a(String paramString)
/* 21:   */   {
/* 22:21 */     return new bet(paramString);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String a(Boolean paramBoolean)
/* 26:   */   {
/* 27:31 */     return paramBoolean.toString();
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bet
 * JD-Core Version:    0.7.0.1
 */