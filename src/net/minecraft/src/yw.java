package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class yw
/*  6:   */   extends zb
/*  7:   */ {
/*  8:22 */   private static final Predicate b = beq.a(BlockList.tallgrass).a(bbh.a, Predicates.<Comparable>equalTo(bbi.b));
/*  9:   */   private EntityMob c;
/* 10:   */   private World d;
/* 11:   */   int a;
/* 12:   */   
/* 13:   */   public yw(EntityMob paramxn)
/* 14:   */   {
/* 15:29 */     this.c = paramxn;
/* 16:30 */     this.d = paramxn.world;
/* 17:31 */     a(7);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a()
/* 21:   */   {
/* 22:36 */     if (this.c.getRNG().nextInt(this.c.i_() ? 50 : 1000) != 0) {
/* 23:37 */       return false;
/* 24:   */     }
/* 25:40 */     BlockPosition localdt = new BlockPosition(this.c.xPos, this.c.yPos, this.c.zPos);
/* 26:41 */     if (b.apply(this.d.getBlock(localdt))) {
/* 27:42 */       return true;
/* 28:   */     }
/* 29:44 */     if (this.d.getBlock(localdt.down()).getProto() == BlockList.grass) {
/* 30:45 */       return true;
/* 31:   */     }
/* 32:47 */     return false;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void c()
/* 36:   */   {
/* 37:52 */     this.a = 40;
/* 38:53 */     this.d.sendSignal(this.c, (byte)10);
/* 39:54 */     this.c.s().n();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void d()
/* 43:   */   {
/* 44:59 */     this.a = 0;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean b()
/* 48:   */   {
/* 49:64 */     return this.a > 0;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int f()
/* 53:   */   {
/* 54:68 */     return this.a;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void e()
/* 58:   */   {
/* 59:73 */     this.a = Math.max(0, this.a - 1);
/* 60:74 */     if (this.a != 4) {
/* 61:75 */       return;
/* 62:   */     }
/* 63:78 */     BlockPosition localdt1 = new BlockPosition(this.c.xPos, this.c.yPos, this.c.zPos);
/* 64:80 */     if (b.apply(this.d.getBlock(localdt1)))
/* 65:   */     {
/* 66:81 */       if (this.d.getGameRules().getBoolean("mobGriefing")) {
/* 67:82 */         this.d.b(localdt1, false);
/* 68:   */       }
/* 69:84 */       this.c.v();
/* 70:   */     }
/* 71:   */     else
/* 72:   */     {
/* 73:86 */       BlockPosition localdt2 = localdt1.down();
/* 74:87 */       if (this.d.getBlock(localdt2).getProto() == BlockList.grass)
/* 75:   */       {
/* 76:88 */         if (this.d.getGameRules().getBoolean("mobGriefing"))
/* 77:   */         {
/* 78:89 */           this.d.playLevelEvent(2001, localdt2, ProtoBlock.a(BlockList.grass));
/* 79:90 */           this.d.setBlock(localdt2, BlockList.dirt.instance(), 2);
/* 80:   */         }
/* 81:92 */         this.c.v();
/* 82:   */       }
/* 83:   */     }
/* 84:   */   }
/* 85:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yw
 * JD-Core Version:    0.7.0.1
 */