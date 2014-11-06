package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import java.net.SocketAddress;
/*  3:   */ 
/*  4:   */ public class cyj
/*  5:   */   extends sn
/*  6:   */ {
/*  7:   */   private NBTTagCompound h;
/*  8:   */   
/*  9:   */   public cyj(cyk paramcyk)
/* 10:   */   {
/* 11:14 */     super(paramcyk);
/* 12:   */     
/* 13:16 */     a(10);
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void b(qw paramqw)
/* 17:   */   {
/* 18:21 */     if (paramqw.getName().equals(b().R()))
/* 19:   */     {
/* 20:22 */       this.h = new NBTTagCompound();
/* 21:23 */       paramqw.e(this.h);
/* 22:   */     }
/* 23:26 */     super.b(paramqw);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String a(SocketAddress paramSocketAddress, GameProfile paramGameProfile)
/* 27:   */   {
/* 28:31 */     if ((paramGameProfile.getName().equalsIgnoreCase(b().R())) && (a(paramGameProfile.getName()) != null)) {
/* 29:32 */       return "That name is already taken.";
/* 30:   */     }
/* 31:35 */     return super.a(paramSocketAddress, paramGameProfile);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public cyk b()
/* 35:   */   {
/* 36:40 */     return (cyk)super.c();
/* 37:   */   }
/* 38:   */   
/* 39:   */   public NBTTagCompound u()
/* 40:   */   {
/* 41:45 */     return this.h;
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyj
 * JD-Core Version:    0.7.0.1
 */