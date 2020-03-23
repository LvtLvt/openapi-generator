#
# OpenAPI Petstore
# This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
# Version: 1.0.0
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

function New-PSInlineObject1 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AdditionalMetadata},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.IO.FileInfo]
        ${File}
    )

    Process {
        'Creating object: PSPetstore => PSInlineObject1' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $PSO = [PSCustomObject]@{
            "additionalMetadata" = ${AdditionalMetadata}
            "file" = ${File}
        }

        return $PSO
    }
}
