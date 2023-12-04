# Read in libraries -----
library(rjson)

# Calculate -----
# Define the factors and weights for non-material factors
#d <- fromJSON(file="/Users/nessza.fentor/Documents/Personal/clothes_worth/brand_dictionary.json")

# Example run
# Define the factors and weights for non-material factors
B <- 7   # Brand reputation of H&M on a scale of 1-10
Q <- 8   # Quality of materials of the T-shirt on a scale of 1-10
C <- 6   # Construction and craftsmanship on a scale of 1-10
D <- 7   # Design and style on a scale of 1-10
S <- 9   # Condition (assuming it's brand new) on a scale of 1-10
R <- 5   # Rarity or limited edition (assuming it's a regular item) on a scale of 1-10
P <- 6   # Personal sentimental value on a scale of 1-10
M <- 7   # Market trends or resale potential on a scale of 1-10
Price <- 20  # Placeholder price of the T-shirt

# Define weights for non-material factors
w_B <- 0.1
w_Q <- 0.15
w_C <- 0.1
w_D <- 0.15
w_S <- 0.15
w_R <- 0.05
w_P <- 0.1
w_M <- 0.1
w_Price <- 0.15  # Placeholder weight for price

# Define the materials of the T-shirt and their weights
M_cotton <- 8   # Quality of cotton on a scale of 1-10
M_polyester <- 5   # Quality of polyester on a scale of 1-10
M_spandex <- 7   # Quality of spandex on a scale of 1-10

# Define weights for material factors
w_M_cotton <- 0.4
w_M_polyester <- 0.3
w_M_spandex <- 0.3

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
