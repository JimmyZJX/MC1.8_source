package net.minecraft.src;
/*   1:    */ import com.google.common.util.concurrent.FutureCallback;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.concurrent.CancellationException;
/*   4:    */ import java.util.concurrent.locks.ReentrantLock;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ class coj
/*   8:    */   implements FutureCallback<List>
/*   9:    */ {
				private final coa a;
				private final cok b;
				private final coh c;
/*  10:    */   coj(coh paramcoh, coa paramcoa, cok paramcok) {a=paramcoa;b=paramcok;c=paramcoh;}
/*  11:    */   
/*  12:    */   public void onSuccess(List paramList)
/*  13:    */   {
/*  14:122 */     coh.a(this.c, this.a);
/*  15:    */     
/*  16:124 */     this.a.f().lock();
/*  17:    */     try
/*  18:    */     {
/*  19:126 */       if (this.a.a() != cob.c)
/*  20:    */       {
/*  21:127 */         if (!this.a.h()) {
/*  22:128 */           coh.a().warn("Chunk render task was " + this.a.a() + " when I expected it to be uploading; aborting task");
/*  23:    */         }
/*  24:    */         return;
/*  25:    */       }
/*  26:132 */       this.a.a(cob.d);
/*  27:    */     }
/*  28:    */     finally
/*  29:    */     {
/*  30:134 */       this.a.f().unlock();
/*  31:    */     }
/*  32:137 */     this.a.b().a(this.b);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void onFailure(Throwable paramThrowable)
/*  36:    */   {
/*  37:142 */     coh.a(this.c, this.a);
/*  38:143 */     if ((!(paramThrowable instanceof CancellationException)) && (!(paramThrowable instanceof InterruptedException))) {
/*  39:144 */       bsu.z().a(net.minecraft.src.b.a(paramThrowable, "Rendering chunk"));
/*  40:    */     }
/*  41:    */   }
/*  42:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coj
 * JD-Core Version:    0.7.0.1
 */