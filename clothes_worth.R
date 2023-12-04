# Read in libraries -----
library(rjson)

# Calculate -----
# Define the factors and weights for non-material factors
d <- fromJSON(file="/Users/nessza.fentor/Documents/Personal/clothes_worth/brand_dictionary.json")
factors <- c(B, Q, C, D, S, R, P, M, Price)  # Add the price factor
weights <- c(w_B, w_Q, w_C, w_D, w_S, w_R, w_P, w_M, w_Price)  # Add the weight for price

# Define the materials and their weights
materials <- c(M_cotton, M_polyester, M_spandex)
material_weights <- c(w_M_cotton, w_M_polyester, w_M_spandex)

# Ensure weights sum to 1
weights <- weights / sum(weights)
material_weights <- material_weights / sum(material_weights)

# Calculate the overall worth
W <- weighted.mean(c(factors, materials), c(weights, material_weights))

# Print the result
print(W)
