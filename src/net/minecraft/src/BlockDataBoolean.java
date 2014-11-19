package net.minecraft.src;
/*  1:   */ import com.google.common.collect.ImmutableSet;
/*  2:   */ import java.util.Collection;
/*  3:   */ 
/*  4:   */ public class BlockDataBoolean
/*  5:   */   extends BlockData<Boolean>
/*  6:   */ {
/*  7:   */   private final ImmutableSet<Boolean> values;
/*  8:   */   
/*  9:   */   protected BlockDataBoolean(String paramString)
/* 10:   */   {
/* 11:11 */     super(paramString, Boolean.class);
/* 12:12 */     this.values = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));
/* 13:   */   }
/* 14:   */   
/* 15:   */   public Collection<Boolean> getValues()
/* 16:   */   {
/* 17:17 */     return this.values;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static BlockDataBoolean getInstance(String paramString)
/* 21:   */   {
/* 22:21 */     return new BlockDataBoolean(paramString);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String toString(Boolean paramBoolean)
/* 26:   */   {
/* 27:31 */     return paramBoolean.toString();
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bet
 * JD-Core Version:    0.7.0.1
 */