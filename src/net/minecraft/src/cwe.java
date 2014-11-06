package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import com.google.common.collect.Sets;
/*  4:   */ import java.io.IOException;
/*  5:   */ import java.util.ArrayList;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ import java.util.SortedSet;
/*  9:   */ import org.apache.logging.log4j.LogManager;
/* 10:   */ import org.apache.logging.log4j.Logger;
/* 11:   */ 
/* 12:   */ public class cwe
/* 13:   */   implements cvl
/* 14:   */ {
/* 15:20 */   private static final Logger b = LogManager.getLogger();
/* 16:   */   private final cwk c;
/* 17:   */   private String d;
/* 18:27 */   protected static final cwf a = new cwf();
/* 19:28 */   private Map<String,cwd> e = Maps.newHashMap();
/* 20:   */   
/* 21:   */   public cwe(cwk paramcwk, String paramString)
/* 22:   */   {
/* 23:31 */     this.c = paramcwk;
/* 24:   */     
/* 25:33 */     this.d = paramString;
/* 26:   */     
/* 27:35 */     cwc.a(a);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void a(List<cvm> paramList)
/* 31:   */   {
/* 32:39 */     this.e.clear();
/* 33:41 */     for (cvm localcvm : paramList) {
/* 34:   */       try
/* 35:   */       {
/* 36:43 */         cwu localcwu = (cwu)localcvm.a(this.c, "language");
/* 37:44 */         if (localcwu != null) {
/* 38:45 */           for (cwd localcwd : localcwu.a()) {
/* 39:47 */             if (!this.e.containsKey(localcwd.a())) {
/* 40:48 */               this.e.put(localcwd.a(), localcwd);
/* 41:   */             }
/* 42:   */           }
/* 43:   */         }
/* 44:   */       }
/* 45:   */       catch (RuntimeException localRuntimeException)
/* 46:   */       {
/* 47:53 */         b.warn("Unable to parse metadata section of resourcepack: " + localcvm.b(), localRuntimeException);
/* 48:   */       }
/* 49:   */       catch (IOException localIOException)
/* 50:   */       {
/* 51:55 */         b.warn("Unable to parse metadata section of resourcepack: " + localcvm.b(), localIOException);
/* 52:   */       }
/* 53:   */     }
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void a(cvk paramcvk)
/* 57:   */   {
/* 58:62 */     ArrayList<String> localArrayList = Lists.newArrayList(new String[] { "en_US" });
/* 59:63 */     if (!"en_US".equals(this.d)) {
/* 60:64 */       localArrayList.add(this.d);
/* 61:   */     }
/* 62:67 */     a.a(paramcvk, localArrayList);
/* 63:   */     
/* 64:   */ 
/* 65:70 */     fj.a(a.a);
/* 66:   */   }
/* 67:   */   
/* 68:   */   public boolean a()
/* 69:   */   {
/* 70:74 */     return a.a();
/* 71:   */   }
/* 72:   */   
/* 73:   */   public boolean b()
/* 74:   */   {
/* 75:78 */     return (c() != null) && (c().b());
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void a(cwd paramcwd)
/* 79:   */   {
/* 80:82 */     this.d = paramcwd.a();
/* 81:   */   }
/* 82:   */   
/* 83:   */   public cwd c()
/* 84:   */   {
/* 85:86 */     return this.e.containsKey(this.d) ? (cwd)this.e.get(this.d) : (cwd)this.e.get("en_US");
/* 86:   */   }
/* 87:   */   
/* 88:   */   public SortedSet<cwd> d()
/* 89:   */   {
/* 90:90 */     return Sets.newTreeSet(this.e.values());
/* 91:   */   }
/* 92:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwe
 * JD-Core Version:    0.7.0.1
 */