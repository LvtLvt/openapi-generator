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
	"fmt"
)

// Mammal struct for Mammal
type Mammal struct {
    MammalInterface interface { GetClassName() string }
}

func (s *Mammal) MarshalJSON() ([]byte, error) {
    return json.Marshal(s.MammalInterface)
}

func (s *Mammal) UnmarshalJSON(src []byte) error {
    var err error
    var unmarshaled map[string]interface{}
    err = json.Unmarshal(src, &unmarshaled)
    if err != nil {
        return err
    }
    if v, ok := unmarshaled["className"]; ok {
        switch v {
            case "whale":
                var result *Whale = &Whale{}
                err = json.Unmarshal(src, result)
                if err != nil {
                    return err
                }
                s.MammalInterface = result
                return nil
            case "zebra":
                var result *Zebra = &Zebra{}
                err = json.Unmarshal(src, result)
                if err != nil {
                    return err
                }
                s.MammalInterface = result
                return nil
            default:
                return fmt.Errorf("No oneOf model has 'className' equal to %s", v)
        }
    } else {
        return fmt.Errorf("Discriminator property 'className' not found in unmarshaled payload: %+v", unmarshaled)
    }
}
type NullableMammal struct {
	Value Mammal
	ExplicitNull bool
}

func (v NullableMammal) MarshalJSON() ([]byte, error) {
    switch {
    case v.ExplicitNull:
        return []byte("null"), nil
    default:
		return json.Marshal(v.Value)
	}
}

func (v *NullableMammal) UnmarshalJSON(src []byte) error {
	if bytes.Equal(src, []byte("null")) {
		v.ExplicitNull = true
		return nil
	}

	return json.Unmarshal(src, &v.Value)
}
