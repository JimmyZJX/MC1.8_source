package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.io.FileNotFoundException;
import java.io.IOException;
/*   3:    */ import java.io.InputStream;
/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Set;
import java.util.zip.ZipException;

/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class cvc
/*  11:    */   implements cvk
/*  12:    */ {
/*  13: 14 */   private static final Logger b = LogManager.getLogger();
/*  14: 15 */   protected final List<cvm> a = Lists.newArrayList();
/*  15:    */   private final cwk c;
/*  16:    */   
/*  17:    */   public cvc(cwk paramcwk)
/*  18:    */   {
/*  19: 19 */     this.c = paramcwk;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(cvm paramcvm)
/*  23:    */   {
/*  24: 24 */     this.a.add(paramcvm);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public Set a()
/*  28:    */   {
/*  29: 29 */     return null;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public cvj a(oa paramoa) throws IOException
/*  33:    */   {
/*  34: 34 */     cvm localObject = null;
/*  35: 35 */     oa localoa = c(paramoa);
/*  36: 37 */     for (int i = this.a.size() - 1; i >= 0; i--)
/*  37:    */     {
/*  38: 38 */       cvm localcvm = (cvm)this.a.get(i);
/*  39: 39 */       if ((localObject == null) && (localcvm.b(localoa))) {
/*  40: 40 */         localObject = localcvm;
/*  41:    */       }
/*  42: 43 */       if (localcvm.b(paramoa))
/*  43:    */       {
/*  44: 44 */         InputStream localInputStream = null;
/*  45: 45 */         if (localObject != null) {
/*  46: 46 */           localInputStream = a(localoa, localObject);
/*  47:    */         }
/*  48: 48 */         return new cvv(localcvm.b(), paramoa, a(paramoa, localcvm), localInputStream, this.c);
/*  49:    */       }
/*  50:    */     }
/*  51: 52 */     throw new FileNotFoundException(paramoa.toString());
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected InputStream a(oa paramoa, cvm paramcvm) throws ZipException, IOException
/*  55:    */   {
/*  56: 56 */     InputStream localInputStream = paramcvm.a(paramoa);
/*  57: 57 */     return b.isDebugEnabled() ? new cvd(localInputStream, paramoa, paramcvm.b()) : localInputStream;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public List b(oa paramoa) throws IOException
/*  61:    */   {
/*  62: 97 */     ArrayList localArrayList = Lists.newArrayList();
/*  63: 98 */     oa localoa = c(paramoa);
/*  64:100 */     for (cvm localcvm : this.a) {
/*  65:101 */       if (localcvm.b(paramoa))
/*  66:    */       {
/*  67:102 */         InputStream localInputStream = localcvm.b(localoa) ? a(localoa, localcvm) : null;
/*  68:103 */         localArrayList.add(new cvv(localcvm.b(), paramoa, a(paramoa, localcvm), localInputStream, this.c));
/*  69:    */       }
/*  70:    */     }
/*  71:107 */     if (localArrayList.isEmpty()) {
/*  72:108 */       throw new FileNotFoundException(paramoa.toString());
/*  73:    */     }
/*  74:111 */     return localArrayList;
/*  75:    */   }
/*  76:    */   
/*  77:    */   static oa c(oa paramoa)
/*  78:    */   {
/*  79:115 */     return new oa(paramoa.b(), paramoa.a() + ".mcmeta");
/*  80:    */   }
				static Logger b() {return b;}
/*  81:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvc
 * JD-Core Version:    0.7.0.1
 */