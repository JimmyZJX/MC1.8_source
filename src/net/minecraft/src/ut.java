package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import com.google.gson.Gson;
/*  3:   */ import com.google.gson.TypeAdapter;
/*  4:   */ import com.google.gson.TypeAdapterFactory;
/*  5:   */ import com.google.gson.reflect.TypeToken;
/*  6:   */ import java.util.HashMap;
/*  7:   */ import java.util.Locale;
/*  8:   */ import java.util.Map;
/*  9:   */ 
/* 10:   */ public class ut
/* 11:   */   implements TypeAdapterFactory
/* 12:   */ {
/* 13:   */   public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
/* 14:   */   {
/* 15:23 */     Class localClass = paramTypeToken.getRawType();
/* 16:24 */     if (!localClass.isEnum()) {
/* 17:25 */       return null;
/* 18:   */     }
/* 19:28 */     HashMap localHashMap = Maps.newHashMap();
/* 20:29 */     for (Object localObject : localClass.getEnumConstants()) {
/* 21:30 */       localHashMap.put(a(localObject), localObject);
/* 22:   */     }
/* 23:33 */     return new uu(this, localHashMap);
/* 24:   */   }
/* 25:   */   
/* 26:   */   private String a(Object paramObject)
/* 27:   */   {
/* 28:56 */     if ((paramObject instanceof Enum)) {
/* 29:57 */       return ((Enum)paramObject).name().toLowerCase(Locale.US);
/* 30:   */     }
/* 31:59 */     return paramObject.toString().toLowerCase(Locale.US);
/* 32:   */   }
			  static String a(ut arg0, Object arg1) {return arg0.a(arg1);}
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ut
 * JD-Core Version:    0.7.0.1
 */