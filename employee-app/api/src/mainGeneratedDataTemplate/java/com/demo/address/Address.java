
package com.demo.address;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/demo/address/Address.pdl.")
public class Address
    extends RecordTemplate
{

    private final static Address.Fields _fields = new Address.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.demo.address,record Address{country:string,state:string}", SchemaFormatType.PDL));
    private String _countryField = null;
    private String _stateField = null;
    private Address.ChangeListener __changeListener = new Address.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Country = SCHEMA.getField("country");
    private final static RecordDataSchema.Field FIELD_State = SCHEMA.getField("state");

    public Address() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Address(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Address.Fields fields() {
        return _fields;
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for country
     * 
     * @see Address.Fields#country
     */
    public boolean hasCountry() {
        if (_countryField!= null) {
            return true;
        }
        return super._map.containsKey("country");
    }

    /**
     * Remover for country
     * 
     * @see Address.Fields#country
     */
    public void removeCountry() {
        super._map.remove("country");
    }

    /**
     * Getter for country
     * 
     * @see Address.Fields#country
     */
    public String getCountry(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCountry();
            case DEFAULT:
            case NULL:
                if (_countryField!= null) {
                    return _countryField;
                } else {
                    Object __rawValue = super._map.get("country");
                    _countryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _countryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for country
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Address.Fields#country
     */
    @Nonnull
    public String getCountry() {
        if (_countryField!= null) {
            return _countryField;
        } else {
            Object __rawValue = super._map.get("country");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("country");
            }
            _countryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _countryField;
        }
    }

    /**
     * Setter for country
     * 
     * @see Address.Fields#country
     */
    public Address setCountry(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCountry(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field country of com.demo.address.Address");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "country", value);
                    _countryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCountry();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "country", value);
                    _countryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "country", value);
                    _countryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for country
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Address.Fields#country
     */
    public Address setCountry(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field country of com.demo.address.Address to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "country", value);
            _countryField = value;
        }
        return this;
    }

    /**
     * Existence checker for state
     * 
     * @see Address.Fields#state
     */
    public boolean hasState() {
        if (_stateField!= null) {
            return true;
        }
        return super._map.containsKey("state");
    }

    /**
     * Remover for state
     * 
     * @see Address.Fields#state
     */
    public void removeState() {
        super._map.remove("state");
    }

    /**
     * Getter for state
     * 
     * @see Address.Fields#state
     */
    public String getState(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getState();
            case DEFAULT:
            case NULL:
                if (_stateField!= null) {
                    return _stateField;
                } else {
                    Object __rawValue = super._map.get("state");
                    _stateField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _stateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for state
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Address.Fields#state
     */
    @Nonnull
    public String getState() {
        if (_stateField!= null) {
            return _stateField;
        } else {
            Object __rawValue = super._map.get("state");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("state");
            }
            _stateField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _stateField;
        }
    }

    /**
     * Setter for state
     * 
     * @see Address.Fields#state
     */
    public Address setState(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setState(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field state of com.demo.address.Address");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "state", value);
                    _stateField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeState();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "state", value);
                    _stateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "state", value);
                    _stateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for state
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Address.Fields#state
     */
    public Address setState(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field state of com.demo.address.Address to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "state", value);
            _stateField = value;
        }
        return this;
    }

    @Override
    public Address clone()
        throws CloneNotSupportedException
    {
        Address __clone = ((Address) super.clone());
        __clone.__changeListener = new Address.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Address copy()
        throws CloneNotSupportedException
    {
        Address __copy = ((Address) super.copy());
        __copy._countryField = null;
        __copy._stateField = null;
        __copy.__changeListener = new Address.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Address __objectRef;

        private ChangeListener(Address reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "country":
                    __objectRef._countryField = null;
                    break;
                case "state":
                    __objectRef._stateField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public PathSpec country() {
            return new PathSpec(getPathComponents(), "country");
        }

        public PathSpec state() {
            return new PathSpec(getPathComponents(), "state");
        }

    }

}
