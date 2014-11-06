package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Queues;
/*   3:    */ import com.google.common.util.concurrent.Futures;
/*   4:    */ import com.google.common.util.concurrent.ListenableFuture;
/*   5:    */ import com.google.common.util.concurrent.ListenableFutureTask;
/*   6:    */ import com.google.common.util.concurrent.ThreadFactoryBuilder;

/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Queue;
/*  10:    */ import java.util.concurrent.BlockingQueue;
/*  11:    */ import java.util.concurrent.ThreadFactory;
/*  12:    */ import java.util.concurrent.locks.ReentrantLock;

/*  13:    */ import org.apache.logging.log4j.LogManager;
/*  14:    */ import org.apache.logging.log4j.Logger;
/*  15:    */ import org.lwjgl.opengl.GL11;
/*  16:    */ 
/*  17:    */ public class cod
/*  18:    */ {
/*  19: 25 */   private static final Logger a = LogManager.getLogger();
/*  20: 26 */   private static final ThreadFactory b = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
/*  21: 30 */   private final List<coh> c = Lists.newArrayList();
/*  22: 31 */   private final BlockingQueue<coa> d = Queues.newArrayBlockingQueue(100);
/*  23: 32 */   private final BlockingQueue<cjb> e = Queues.newArrayBlockingQueue(5);
/*  24: 33 */   private final ciy f = new ciy();
/*  25: 34 */   private final ckz g = new ckz();
/*  26: 35 */   private final Queue<ListenableFutureTask<?>> h = Queues.newArrayDeque();
/*  27:    */   private final coh i;
/*  28:    */   
/*  29:    */   public cod()
/*  30:    */   {
/*  31: 39 */     for (int j = 0; j < 2; j++)
/*  32:    */     {
/*  33: 40 */       coh localcoh = new coh(this);
/*  34: 41 */       Thread localThread = b.newThread(localcoh);
/*  35: 42 */       localThread.start();
/*  36: 43 */       this.c.add(localcoh);
/*  37:    */     }
/*  38: 45 */     for (int j = 0; j < 5; j++) {
/*  39: 46 */       this.e.add(new cjb());
/*  40:    */     }
/*  41: 49 */     this.i = new coh(this, new cjb());
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String a()
/*  45:    */   {
/*  46: 53 */     return String.format("pC: %03d, pU: %1d, aB: %1d", new Object[] { Integer.valueOf(this.d.size()), Integer.valueOf(this.h.size()), Integer.valueOf(this.e.size()) });
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(long paramLong)
/*  50:    */   {
/*  51: 57 */     boolean bool = false;
/*  52:    */     for (;;)
/*  53:    */     {
/*  54: 60 */       int j = 0;
/*  55: 74 */       synchronized (this.h)
/*  56:    */       {
/*  57: 75 */         if (!this.h.isEmpty())
/*  58:    */         {
/*  59: 76 */           this.h.poll().run();
/*  60: 77 */           j = 1;
/*  61: 78 */           bool = true;
/*  62:    */         }
/*  63:    */       }
/*  64: 82 */       if ((paramLong == 0L) || (j == 0)) {
/*  65:    */         break;
/*  66:    */       }
/*  67: 86 */       long l = paramLong - System.nanoTime();
/*  68: 87 */       if ((l < 0L) || (l > 1000000000L)) {
/*  69:    */         break;
/*  70:    */       }
/*  71:    */     }
/*  72: 92 */     return bool;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean a(cop paramcop)
/*  76:    */   {
/*  77: 96 */     paramcop.c().lock();
/*  78:    */     try
/*  79:    */     {
/*  80: 98 */       coa localcoa = paramcop.d();
/*  81: 99 */       localcoa.a(new coe(this, localcoa));
/*  82:    */       
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:105 */       boolean bool1 = this.d.offer(localcoa);
/*  88:106 */       if (!bool1) {
/*  89:107 */         localcoa.e();
/*  90:    */       }
/*  91:109 */       return bool1;
/*  92:    */     }
/*  93:    */     finally
/*  94:    */     {
/*  95:111 */       paramcop.c().unlock();
/*  96:    */     }
/*  97:    */   }
/*  98:    */   
/*  99:    */   public boolean b(cop paramcop)
/* 100:    */   {
/* 101:116 */     paramcop.c().lock();
/* 102:    */     try
/* 103:    */     {
/* 104:118 */       coa localcoa = paramcop.d();
/* 105:    */       try
/* 106:    */       {
/* 107:120 */         this.i.a(localcoa);
/* 108:    */       }
/* 109:    */       catch (InterruptedException localInterruptedException) {}
/* 110:123 */       return true;
/* 111:    */     }
/* 112:    */     finally
/* 113:    */     {
/* 114:125 */       paramcop.c().unlock();
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void b()
/* 119:    */   {
/* 120:130 */     e();
/* 121:132 */     while (a(0L)) {}
/* 122:136 */     ArrayList<cjb> localArrayList = Lists.newArrayList();
/* 123:137 */     while (localArrayList.size() != 5) {
/* 124:    */       try
/* 125:    */       {
/* 126:139 */         localArrayList.add(c());
/* 127:    */       }
/* 128:    */       catch (InterruptedException localInterruptedException) {}
/* 129:    */     }
/* 130:144 */     this.e.addAll(localArrayList);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void a(cjb paramcjb)
/* 134:    */   {
/* 135:148 */     this.e.add(paramcjb);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public cjb c() throws InterruptedException
/* 139:    */   {
/* 140:152 */     return this.e.take();
/* 141:    */   }
/* 142:    */   
/* 143:    */   public coa d() throws InterruptedException
/* 144:    */   {
/* 145:156 */     return this.d.take();
/* 146:    */   }
/* 147:    */   
/* 148:    */   public boolean c(cop paramcop)
/* 149:    */   {
/* 150:160 */     paramcop.c().lock();
/* 151:    */     try
/* 152:    */     {
/* 153:162 */       coa localcoa = paramcop.e();
/* 154:    */       boolean bool;
/* 155:163 */       if (localcoa != null)
/* 156:    */       {
/* 157:164 */         localcoa.a(new cof(this, localcoa));
/* 158:    */         
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:170 */         return this.d.offer(localcoa);
/* 164:    */       }
/* 165:172 */       return true;
/* 166:    */     }
/* 167:    */     finally
/* 168:    */     {
/* 169:174 */       paramcop.c().unlock();
/* 170:    */     }
/* 171:    */   }
/* 172:    */   
/* 173:    */   public ListenableFuture<?> a(aql paramaql, VertexBuffer paramciv, cop paramcop, cok paramcok)
/* 174:    */   {
/* 175:195 */     if (bsu.z().aH())
/* 176:    */     {
/* 177:196 */       if (dax.f()) {
/* 178:197 */         a(paramciv, paramcop.b(paramaql.ordinal()));
/* 179:    */       } else {
/* 180:199 */         a(paramciv, ((coo)paramcop).a(paramaql, paramcok), paramcop);
/* 181:    */       }
/* 182:201 */       paramciv.c(0.0D, 0.0D, 0.0D);
/* 183:202 */       return Futures.immediateFuture(null);
/* 184:    */     }
/* 185:204 */     ListenableFutureTask<?> localListenableFutureTask = ListenableFutureTask.create(new cog(this, paramaql, paramciv, paramcop, paramcok), null);
/* 186:211 */     synchronized (this.h)
/* 187:    */     {
/* 188:212 */       this.h.add(localListenableFutureTask);
/* 189:    */     }
/* 190:214 */     return localListenableFutureTask;
/* 191:    */   }
/* 192:    */   
/* 193:    */   private void a(VertexBuffer paramciv, int paramInt, cop paramcop)
/* 194:    */   {
/* 195:219 */     GL11.glNewList(paramInt, 4864);
/* 196:    */     
/* 197:221 */     cjm.glPushMatrix();
/* 198:222 */     paramcop.f();
/* 199:223 */     this.f.draw(paramciv, paramciv.e());
/* 200:224 */     cjm.glPopMatrix();
/* 201:    */     
/* 202:226 */     GL11.glEndList();
/* 203:    */   }
/* 204:    */   
/* 205:    */   private void a(VertexBuffer paramciv, cur paramcur)
/* 206:    */   {
/* 207:230 */     this.g.a(paramcur);
/* 208:231 */     this.g.draw(paramciv, paramciv.e());
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void e()
/* 212:    */   {
/* 213:235 */     this.d.clear();
/* 214:    */   }
				static BlockingQueue<coa> a(cod arg0) {return arg0.d;}
/* 215:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cod
 * JD-Core Version:    0.7.0.1
 */