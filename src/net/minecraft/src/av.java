package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class av
/*  4:   */   implements Predicate<tk>
/*  5:   */ {
			  private final qw a;
			  private final PlayerStat b;
			  private final au c;
/*  6:   */   av(au paramau, qw paramqw, PlayerStat paramtq) {a=paramqw;b=paramtq;c=paramau;}
/*  7:   */   
/*  8:   */   public boolean apply(tk paramtk)
/*  9:   */   {
/* 10:93 */     return (this.a.A().a(paramtk)) && (paramtk != this.b);
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     av
 * JD-Core Version:    0.7.0.1
 */