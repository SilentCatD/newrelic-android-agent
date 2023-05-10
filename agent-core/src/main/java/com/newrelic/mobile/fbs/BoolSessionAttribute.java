// automatically generated by the FlatBuffers compiler, do not modify

package com.newrelic.mobile.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class BoolSessionAttribute extends Table {
  public static BoolSessionAttribute getRootAsBoolSessionAttribute(ByteBuffer _bb) { return getRootAsBoolSessionAttribute(_bb, new BoolSessionAttribute()); }
  public static BoolSessionAttribute getRootAsBoolSessionAttribute(ByteBuffer _bb, BoolSessionAttribute obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public BoolSessionAttribute __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public boolean value() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateValue(boolean value) { int o = __offset(6); if (o != 0) { bb.put(o + bb_pos, (byte)(value ? 1 : 0)); return true; } else { return false; } }

  public static int createBoolSessionAttribute(FlatBufferBuilder builder,
      int nameOffset,
      boolean value) {
    builder.startObject(2);
    BoolSessionAttribute.addName(builder, nameOffset);
    BoolSessionAttribute.addValue(builder, value);
    return BoolSessionAttribute.endBoolSessionAttribute(builder);
  }

  public static void startBoolSessionAttribute(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, boolean value) { builder.addBoolean(1, value, false); }
  public static int endBoolSessionAttribute(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // name
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static BoolSessionAttribute __lookup_by_key(BoolSessionAttribute obj, int vectorLocation, String key, ByteBuffer bb) {
    byte[] byteKey = key.getBytes(Table.UTF8_CHARSET.get());
    int span = bb.getInt(vectorLocation - 4);
    int start = 0;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = compareStrings(__offset(4, bb.capacity() - tableOffset, bb), byteKey, bb);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return (obj == null ? new BoolSessionAttribute() : obj).__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

