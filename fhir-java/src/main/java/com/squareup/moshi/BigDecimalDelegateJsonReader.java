/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import okio.BufferedSource;

public class BigDecimalDelegateJsonReader extends JsonReader {

    JsonReader delegate;

    public BigDecimalDelegateJsonReader(JsonReader delegate) {
        this.delegate = delegate;
    }

    public @Nullable
    Object readJsonValueBigDecimal() throws IOException {
        switch (delegate.peek()) {
            case BEGIN_ARRAY:
                List<Object> list = new ArrayList<>();
                beginArray();
                while (hasNext()) {
                    list.add(readJsonValueBigDecimal());
                }
                endArray();
                return list;

            case BEGIN_OBJECT:
                Map<String, Object> map = new LinkedHashTreeMap<>();
                beginObject();
                while (hasNext()) {
                    String name = nextName();
                    Object value = readJsonValueBigDecimal();
                    Object replaced = map.put(name, value);
                    if (replaced != null) {
                        throw new JsonDataException("Map key '" + name + "' has multiple values at path "
                                + getPath() + ": " + replaced + " and " + value);
                    }
                }
                endObject();
                return map;

            case STRING:
                return nextString();

            case NUMBER:
                return nextDecimal();

            case BOOLEAN:
                return nextBoolean();

            case NULL:
                return nextNull();

            default:
                throw new IllegalStateException(
                        "Expected a value but was " + peek() + " at path " + getPath());
        }
    }

    public BigDecimal nextDecimal() throws IOException {
        return new BigDecimal(delegate.nextString());
    }

    @Override
    public void beginArray() throws IOException {
        delegate.beginArray();
    }

    @Override
    public void endArray() throws IOException {
        delegate.endArray();
    }

    @Override
    public void beginObject() throws IOException {
        delegate.beginObject();
    }

    @Override
    public void endObject() throws IOException {
        delegate.endObject();
    }

    @Override
    public boolean hasNext() throws IOException {
        return delegate.hasNext();
    }

    @Override
    public Token peek() throws IOException {
        return delegate.peek();
    }

    @Override
    public String nextName() throws IOException {
        return delegate.nextName();
    }

    @Override
    public int selectName(Options options) throws IOException {
        return delegate.selectName(options);
    }

    @Override
    public void skipName() throws IOException {
        delegate.skipName();
    }

    @Override
    public String nextString() throws IOException {
        return delegate.nextString();
    }

    @Override
    public int selectString(Options options) throws IOException {
        return delegate.selectString(options);
    }

    @Override
    public boolean nextBoolean() throws IOException {
        return delegate.nextBoolean();
    }

    @Nullable
    @Override
    public <T> T nextNull() throws IOException {
        return delegate.nextNull();
    }

    @Override
    public double nextDouble() throws IOException {
        return delegate.nextDouble();
    }

    @Override
    public long nextLong() throws IOException {
        return delegate.nextLong();
    }

    @Override
    public int nextInt() throws IOException {
        return delegate.nextInt();
    }

    @Override
    public BufferedSource nextSource() throws IOException {
        return delegate.nextSource();
    }

    @Override
    public void skipValue() throws IOException {
        delegate.skipValue();
    }

    @Override
    public JsonReader peekJson() {
        return delegate.peekJson();
    }

    @Override
    public void promoteNameToValue() throws IOException {
        delegate.promoteNameToValue();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }
}
