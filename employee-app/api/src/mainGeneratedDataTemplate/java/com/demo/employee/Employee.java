
package com.demo.employee;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.demo.address.Address;
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from api/src/main/pegasus/com/demo/employee/Employee.pdl.")
public class Employee
    extends RecordTemplate
{

    private final static Employee.Fields _fields = new Employee.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.demo.employee,record Employee{name:string,isIntern:boolean,address:{namespace com.demo.address,record Address{country:string,state:string}}salary:long}", SchemaFormatType.PDL));
    private String _nameField = null;
    private Boolean _isInternField = null;
    private Address _addressField = null;
    private Long _salaryField = null;
    private Employee.ChangeListener __changeListener = new Employee.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_IsIntern = SCHEMA.getField("isIntern");
    private final static RecordDataSchema.Field FIELD_Address = SCHEMA.getField("address");
    private final static RecordDataSchema.Field FIELD_Salary = SCHEMA.getField("salary");

    public Employee() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Employee(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Employee.Fields fields() {
        return _fields;
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see Employee.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see Employee.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see Employee.Fields#name
     */
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Employee.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see Employee.Fields#name
     */
    public Employee setName(String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.demo.employee.Employee");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Employee.Fields#name
     */
    public Employee setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.demo.employee.Employee to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for isIntern
     * 
     * @see Employee.Fields#isIntern
     */
    public boolean hasIsIntern() {
        if (_isInternField!= null) {
            return true;
        }
        return super._map.containsKey("isIntern");
    }

    /**
     * Remover for isIntern
     * 
     * @see Employee.Fields#isIntern
     */
    public void removeIsIntern() {
        super._map.remove("isIntern");
    }

    /**
     * Getter for isIntern
     * 
     * @see Employee.Fields#isIntern
     */
    public Boolean isIsIntern(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsIntern();
            case DEFAULT:
            case NULL:
                if (_isInternField!= null) {
                    return _isInternField;
                } else {
                    Object __rawValue = super._map.get("isIntern");
                    _isInternField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isInternField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isIntern
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Employee.Fields#isIntern
     */
    @Nonnull
    public Boolean isIsIntern() {
        if (_isInternField!= null) {
            return _isInternField;
        } else {
            Object __rawValue = super._map.get("isIntern");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isIntern");
            }
            _isInternField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isInternField;
        }
    }

    /**
     * Setter for isIntern
     * 
     * @see Employee.Fields#isIntern
     */
    public Employee setIsIntern(Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsIntern(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isIntern of com.demo.employee.Employee");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isIntern", value);
                    _isInternField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsIntern();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isIntern", value);
                    _isInternField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isIntern", value);
                    _isInternField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isIntern
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Employee.Fields#isIntern
     */
    public Employee setIsIntern(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isIntern of com.demo.employee.Employee to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isIntern", value);
            _isInternField = value;
        }
        return this;
    }

    /**
     * Setter for isIntern
     * 
     * @see Employee.Fields#isIntern
     */
    public Employee setIsIntern(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isIntern", value);
        _isInternField = value;
        return this;
    }

    /**
     * Existence checker for address
     * 
     * @see Employee.Fields#address
     */
    public boolean hasAddress() {
        if (_addressField!= null) {
            return true;
        }
        return super._map.containsKey("address");
    }

    /**
     * Remover for address
     * 
     * @see Employee.Fields#address
     */
    public void removeAddress() {
        super._map.remove("address");
    }

    /**
     * Getter for address
     * 
     * @see Employee.Fields#address
     */
    public Address getAddress(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAddress();
            case DEFAULT:
            case NULL:
                if (_addressField!= null) {
                    return _addressField;
                } else {
                    Object __rawValue = super._map.get("address");
                    _addressField = ((__rawValue == null)?null:new Address(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _addressField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for address
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Employee.Fields#address
     */
    @Nonnull
    public Address getAddress() {
        if (_addressField!= null) {
            return _addressField;
        } else {
            Object __rawValue = super._map.get("address");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("address");
            }
            _addressField = ((__rawValue == null)?null:new Address(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _addressField;
        }
    }

    /**
     * Setter for address
     * 
     * @see Employee.Fields#address
     */
    public Employee setAddress(Address value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAddress(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field address of com.demo.employee.Employee");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "address", value.data());
                    _addressField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAddress();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "address", value.data());
                    _addressField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "address", value.data());
                    _addressField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for address
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Employee.Fields#address
     */
    public Employee setAddress(
        @Nonnull
        Address value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field address of com.demo.employee.Employee to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "address", value.data());
            _addressField = value;
        }
        return this;
    }

    /**
     * Existence checker for salary
     * 
     * @see Employee.Fields#salary
     */
    public boolean hasSalary() {
        if (_salaryField!= null) {
            return true;
        }
        return super._map.containsKey("salary");
    }

    /**
     * Remover for salary
     * 
     * @see Employee.Fields#salary
     */
    public void removeSalary() {
        super._map.remove("salary");
    }

    /**
     * Getter for salary
     * 
     * @see Employee.Fields#salary
     */
    public Long getSalary(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSalary();
            case DEFAULT:
            case NULL:
                if (_salaryField!= null) {
                    return _salaryField;
                } else {
                    Object __rawValue = super._map.get("salary");
                    _salaryField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _salaryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for salary
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Employee.Fields#salary
     */
    @Nonnull
    public Long getSalary() {
        if (_salaryField!= null) {
            return _salaryField;
        } else {
            Object __rawValue = super._map.get("salary");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("salary");
            }
            _salaryField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _salaryField;
        }
    }

    /**
     * Setter for salary
     * 
     * @see Employee.Fields#salary
     */
    public Employee setSalary(Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSalary(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field salary of com.demo.employee.Employee");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "salary", DataTemplateUtil.coerceLongInput(value));
                    _salaryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSalary();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "salary", DataTemplateUtil.coerceLongInput(value));
                    _salaryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "salary", DataTemplateUtil.coerceLongInput(value));
                    _salaryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for salary
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Employee.Fields#salary
     */
    public Employee setSalary(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field salary of com.demo.employee.Employee to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "salary", DataTemplateUtil.coerceLongInput(value));
            _salaryField = value;
        }
        return this;
    }

    /**
     * Setter for salary
     * 
     * @see Employee.Fields#salary
     */
    public Employee setSalary(long value) {
        CheckedUtil.putWithoutChecking(super._map, "salary", DataTemplateUtil.coerceLongInput(value));
        _salaryField = value;
        return this;
    }

    @Override
    public Employee clone()
        throws CloneNotSupportedException
    {
        Employee __clone = ((Employee) super.clone());
        __clone.__changeListener = new Employee.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Employee copy()
        throws CloneNotSupportedException
    {
        Employee __copy = ((Employee) super.copy());
        __copy._isInternField = null;
        __copy._addressField = null;
        __copy._nameField = null;
        __copy._salaryField = null;
        __copy.__changeListener = new Employee.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Employee __objectRef;

        private ChangeListener(Employee reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "isIntern":
                    __objectRef._isInternField = null;
                    break;
                case "address":
                    __objectRef._addressField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "salary":
                    __objectRef._salaryField = null;
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

        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        public PathSpec isIntern() {
            return new PathSpec(getPathComponents(), "isIntern");
        }

        public com.demo.address.Address.Fields address() {
            return new com.demo.address.Address.Fields(getPathComponents(), "address");
        }

        public PathSpec salary() {
            return new PathSpec(getPathComponents(), "salary");
        }

    }

}
