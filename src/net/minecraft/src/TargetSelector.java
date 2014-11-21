package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ public class TargetSelector
/*   8:    */ {
/*   9: 12 */   private static final Logger LOGGER = LogManager.getLogger();
/*  10: 25 */   private List<zd> b = Lists.newArrayList();
/*  11: 26 */   private List<zd> c = Lists.newArrayList();
/*  12:    */   private final Profiler profiler;
/*  13:    */   private int e;
/*  14: 29 */   private int f = 3;
/*  15:    */   
/*  16:    */   public TargetSelector(Profiler profiler)
/*  17:    */   {
/*  18: 32 */     this.profiler = profiler;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(int paramInt, zb paramzb)
/*  22:    */   {
/*  23: 36 */     this.b.add(new zd(this, paramInt, paramzb));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(zb paramzb)
/*  27:    */   {
/*  28: 40 */     Iterator<zd> it = this.b.iterator();
/*  29: 41 */     while (it.hasNext())
/*  30:    */     {
/*  31: 42 */       zd localzd = it.next();
/*  32: 43 */       zb localzb = localzd.a;
/*  33: 45 */       if (localzb == paramzb)
/*  34:    */       {
/*  35: 46 */         if (this.c.contains(localzd))
/*  36:    */         {
/*  37: 47 */           localzb.d();
/*  38: 48 */           this.c.remove(localzd);
/*  39:    */         }
/*  40: 51 */         it.remove();
/*  41:    */       }
/*  42:    */     }
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void tick()
/*  46:    */   {
/*  47: 57 */     this.profiler.a("goalSetup");
/*  48:    */     zd localzd;
/*  49: 59 */     if (this.e++ % this.f == 0)
/*  50:    */     {
/*  51: 60 */       for (Iterator<zd> localIterator = this.b.iterator(); localIterator.hasNext();)
/*  52:    */       {
/*  53: 60 */         localzd = (zd)localIterator.next();
/*  54: 61 */         boolean bool = this.c.contains(localzd);
/*  55: 63 */         if (bool)
/*  56:    */         {
/*  57: 64 */           if ((!b(localzd)) || (!a(localzd)))
/*  58:    */           {
/*  59: 65 */             localzd.a.d();
/*  60: 66 */             this.c.remove(localzd);
/*  61:    */           }
/*  62:    */         }
/*  63: 72 */         else if ((b(localzd)) && (localzd.a.a()))
/*  64:    */         {
/*  65: 76 */           localzd.a.c();
/*  66: 77 */           this.c.add(localzd);
/*  67:    */         }
/*  68:    */       }
/*  69:    */     }
/*  70:    */     else
/*  71:    */     {
/*  72: 80 */       Iterator<zd> localIterator = this.c.iterator();
/*  73: 82 */       while (localIterator.hasNext())
/*  74:    */       {
/*  75: 83 */         localzd = (zd)localIterator.next();
/*  76: 84 */         if (!a(localzd))
/*  77:    */         {
/*  78: 85 */           localzd.a.d();
/*  79: 86 */           localIterator.remove();
/*  80:    */         }
/*  81:    */       }
/*  82:    */     }
/*  83: 90 */     this.profiler.b();
/*  84:    */     
/*  85: 92 */     this.profiler.a("goalTick");
/*  86: 98 */     for (Iterator<zd> localIterator = this.c.iterator(); localIterator.hasNext();)
/*  87:    */     {
/*  88: 98 */       localzd = (zd)localIterator.next();
/*  89:    */       
/*  90:    */ 
/*  91:    */ 
/*  92:102 */       localzd.a.e();
/*  93:    */     }
/*  94:104 */     this.profiler.b();
/*  95:    */   }
/*  96:    */   
/*  97:    */   private boolean a(zd paramzd)
/*  98:    */   {
/*  99:108 */     boolean bool = paramzd.a.b();
/* 100:109 */     return bool;
/* 101:    */   }
/* 102:    */   
/* 103:    */   private boolean b(zd paramzd)
/* 104:    */   {
/* 105:117 */     for (zd localzd : this.b) {
/* 106:118 */       if (localzd != paramzd) {
/* 107:122 */         if (paramzd.b >= localzd.b)
/* 108:    */         {
/* 109:123 */           if ((!a(paramzd, localzd)) && (this.c.contains(localzd))) {
/* 110:124 */             return false;
/* 111:    */           }
/* 112:    */         }
/* 113:126 */         else if ((!localzd.a.i()) && (this.c.contains(localzd))) {
/* 114:127 */           return false;
/* 115:    */         }
/* 116:    */       }
/* 117:    */     }
/* 118:130 */     return true;
/* 119:    */   }
/* 120:    */   
/* 121:    */   private boolean a(zd paramzd1, zd paramzd2)
/* 122:    */   {
/* 123:134 */     return (paramzd1.a.j() & paramzd2.a.j()) == 0;
/* 124:    */   }
/* 125:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zc
 * JD-Core Version:    0.7.0.1
 */