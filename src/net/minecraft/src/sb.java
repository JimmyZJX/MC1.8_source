package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import java.util.Date;
/*   3:    */ 
/*   4:    */ class sb
/*   5:    */ {
/*   6:    */   private final GameProfile b;
/*   7:    */   private final Date c;
/*   8:    */   
/*   9:    */   private sb(ry paramry, GameProfile paramGameProfile, Date paramDate)
/*  10:    */   {
/*  11:249 */     this.b = paramGameProfile;
/*  12:250 */     this.c = paramDate;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public GameProfile a()
/*  16:    */   {
/*  17:254 */     return this.b;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public Date b()
/*  21:    */   {
/*  22:258 */     return this.c;
/*  23:    */   }
				sb (ry arg0, GameProfile arg1, Date arg2, rz arg3) {this(arg0,arg1,arg2);}
				static Date a(sb arg0) {return arg0.c;}
/*  24:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sb
 * JD-Core Version:    0.7.0.1
 */