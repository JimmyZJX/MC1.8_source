package net.minecraft.src;
/*  1:   */ import com.google.common.collect.ForwardingSet;
/*  2:   */ import com.google.common.collect.Sets;
/*  3:   */ import com.google.gson.JsonArray;
/*  4:   */ import com.google.gson.JsonElement;
/*  5:   */ import com.google.gson.JsonPrimitive;

import java.util.Set;
/*  7:   */ 
/*  8:   */ public class ua
/*  9:   */   extends ForwardingSet<String>
/* 10:   */   implements tx
/* 11:   */ {
/* 12:12 */   private final Set<String> a = Sets.newHashSet();
/* 13:   */   
/* 14:   */   public void a(JsonElement paramJsonElement)
/* 15:   */   {
/* 16:16 */     if (paramJsonElement.isJsonArray()) {
/* 17:17 */       for (JsonElement localJsonElement : paramJsonElement.getAsJsonArray()) {
/* 18:18 */         add(localJsonElement.getAsString());
/* 19:   */       }
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   public JsonElement a()
/* 24:   */   {
/* 25:25 */     JsonArray localJsonArray = new JsonArray();
/* 26:27 */     for (String str : this) {
/* 27:28 */       localJsonArray.add(new JsonPrimitive(str));
/* 28:   */     }
/* 29:31 */     return localJsonArray;
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected Set<String> delegate()
/* 33:   */   {
/* 34:36 */     return this.a;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ua
 * JD-Core Version:    0.7.0.1
 */