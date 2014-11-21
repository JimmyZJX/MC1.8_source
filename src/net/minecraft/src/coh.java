package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.util.concurrent.Futures;
/*   3:    */ import com.google.common.util.concurrent.ListenableFuture;

/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.concurrent.locks.ReentrantLock;

/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class coh
/*  11:    */   implements Runnable
/*  12:    */ {
/*  13: 20 */   private static final Logger a = LogManager.getLogger();
/*  14:    */   private final cod b;
/*  15:    */   private final cjb c;
/*  16:    */   
/*  17:    */   public coh(cod paramcod)
/*  18:    */   {
/*  19: 26 */     this(paramcod, null);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public coh(cod paramcod, cjb paramcjb)
/*  23:    */   {
/*  24: 30 */     this.b = paramcod;
/*  25: 31 */     this.c = paramcjb;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void run()
/*  29:    */   {
/*  30:    */     try
/*  31:    */     {
/*  32:    */       for (;;)
/*  33:    */       {
/*  34: 38 */         a(this.b.d());
/*  35:    */       }
/*  37: 45 */       // return;
/*  38:    */     }
/*  39:    */     catch (InterruptedException localInterruptedException)
/*  40:    */     {
/*  41: 40 */       a.debug("Stopping due to interrupt");
/*  42: 41 */       return;
/*  43:    */     }
/*  44:    */     catch (Throwable localThrowable)
/*  45:    */     {
/*  46: 43 */       b localb = net.minecraft.src.b.a(localThrowable, "Batching chunks");
/*  47: 44 */       bsu.z().a(bsu.z().b(localb));
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected void a(coa paramcoa) throws InterruptedException
/*  52:    */   {
/*  53: 51 */     paramcoa.f().lock();
/*  54:    */     try
/*  55:    */     {
/*  56: 53 */       if (paramcoa.a() != cob.a)
/*  57:    */       {
/*  58: 54 */         if (!paramcoa.h()) {
/*  59: 55 */           a.warn("Chunk render task was " + paramcoa.a() + " when I expected it to be pending; ignoring task");
/*  60:    */         }
/*  61:    */         return;
/*  62:    */       }
/*  63: 59 */       paramcoa.a(cob.b);
/*  64:    */     }
/*  65:    */     finally
/*  66:    */     {
/*  67: 61 */       paramcoa.f().unlock();
/*  68:    */     }
/*  69: 64 */     Entity localwv = bsu.z().aa();
/*  70: 65 */     if (localwv == null)
/*  71:    */     {
/*  72: 66 */       paramcoa.e();
/*  73: 67 */       return;
/*  74:    */     }
/*  75: 70 */     paramcoa.a(b());
/*  76:    */     
/*  77: 72 */     float f1 = (float)localwv.xPos;
/*  78: 73 */     float f2 = (float)localwv.yPos + localwv.getEyeHeight();
/*  79: 74 */     float f3 = (float)localwv.zPos;
/*  80:    */     
/*  81: 76 */     coc localcoc = paramcoa.g();
/*  82: 77 */     if (localcoc == coc.a) {
/*  83: 78 */       paramcoa.b().b(f1, f2, f3, paramcoa);
/*  84: 79 */     } else if (localcoc == coc.b) {
/*  85: 80 */       paramcoa.b().a(f1, f2, f3, paramcoa);
/*  86:    */     }
/*  87: 83 */     paramcoa.f().lock();
/*  88:    */     try
/*  89:    */     {
/*  90: 85 */       if (paramcoa.a() != cob.b)
/*  91:    */       {
/*  92: 86 */         if (!paramcoa.h()) {
/*  93: 87 */           a.warn("Chunk render task was " + paramcoa.a() + " when I expected it to be compiling; aborting task");
/*  94:    */         }
/*  95: 89 */         b(paramcoa); return;
/*  96:    */       }
/*  97: 93 */       paramcoa.a(cob.c);
/*  98:    */     }
/*  99:    */     finally
/* 100:    */     {
/* 101: 95 */       paramcoa.f().unlock();
/* 102:    */     }
/* 103: 98 */     cok localcok = paramcoa.c();
/* 104: 99 */     ArrayList localArrayList = Lists.newArrayList();
/* 105:101 */     if (localcoc == coc.a) {
/* 106:102 */       for (aql localaql : aql.values()) {
/* 107:103 */         if (localcok.d(localaql)) {
/* 108:104 */           localArrayList.add(this.b.a(localaql, paramcoa.d().a(localaql), paramcoa.b(), localcok));
/* 109:    */         }
/* 110:    */       }
/* 111:107 */     } else if (localcoc == coc.b) {
/* 112:108 */       localArrayList.add(this.b.a(aql.d, paramcoa.d().a(aql.d), paramcoa.b(), localcok));
/* 113:    */     }
/* 114:111 */     ListenableFuture future = Futures.allAsList(localArrayList);
/* 115:112 */     paramcoa.a(new coi(this, future));
/* 116:    */     
/* 117:    */ 
/* 118:    */ 
/* 119:    */ 
/* 120:    */ 
/* 121:    */ 
/* 122:119 */     Futures.addCallback(future, new coj(this, paramcoa, localcok));
/* 123:    */   }
/* 124:    */   
/* 125:    */   private cjb b() throws InterruptedException
/* 126:    */   {
/* 127:151 */     return this.c != null ? this.c : this.b.c();
/* 128:    */   }
/* 129:    */   
/* 130:    */   private void b(coa paramcoa)
/* 131:    */   {
/* 132:155 */     if (this.c == null) {
/* 133:156 */       this.b.a(paramcoa.d());
/* 134:    */     }
/* 135:    */   }
				static void a(coh arg0, coa arg1) {arg0.b(arg1);}
				static Logger a() {return a;}
/* 136:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coh
 * JD-Core Version:    0.7.0.1
 */