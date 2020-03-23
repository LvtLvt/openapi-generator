/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore

import (
	"bytes"
	"encoding/json"
)

// InlineResponseDefault struct for InlineResponseDefault
type InlineResponseDefault struct {
	String *Foo `json:"string,omitempty"`
}

// NewInlineResponseDefault instantiates a new InlineResponseDefault object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInlineResponseDefault() *InlineResponseDefault {
    this := InlineResponseDefault{}
    return &this
}

// NewInlineResponseDefaultWithDefaults instantiates a new InlineResponseDefault object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInlineResponseDefaultWithDefaults() *InlineResponseDefault {
    this := InlineResponseDefault{}
    return &this
}

// GetString returns the String field value if set, zero value otherwise.
func (o *InlineResponseDefault) GetString() Foo {
	if o == nil || o.String == nil {
		var ret Foo
		return ret
	}
	return *o.String
}

// GetStringOk returns a tuple with the String field value if set, zero value otherwise
// and a boolean to check if the value has been set.
func (o *InlineResponseDefault) GetStringOk() (Foo, bool) {
	if o == nil || o.String == nil {
		var ret Foo
		return ret, false
	}
	return *o.String, true
}

// HasString returns a boolean if a field has been set.
func (o *InlineResponseDefault) HasString() bool {
	if o != nil && o.String != nil {
		return true
	}

	return false
}

// SetString gets a reference to the given Foo and assigns it to the String field.
func (o *InlineResponseDefault) SetString(v Foo) {
	o.String = &v
}

type NullableInlineResponseDefault struct {
	Value InlineResponseDefault
	ExplicitNull bool
}

func (v NullableInlineResponseDefault) MarshalJSON() ([]byte, error) {
    switch {
    case v.ExplicitNull:
        return []byte("null"), nil
    default:
		return json.Marshal(v.Value)
	}
}

func (v *NullableInlineResponseDefault) UnmarshalJSON(src []byte) error {
	if bytes.Equal(src, []byte("null")) {
		v.ExplicitNull = true
		return nil
	}

	return json.Unmarshal(src, &v.Value)
}
