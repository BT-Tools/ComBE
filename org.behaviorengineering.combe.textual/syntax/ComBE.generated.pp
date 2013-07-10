[
   Specification                 -- KW["#RT"] _1 _2 _3,
   Specification.1:iter-star     -- _1,
   Specification.2:iter-star     -- _1,
   Specification.3:opt           -- _1,
   Specification.3:opt.1:seq     -- KW["#T"] _1,
   Requirement                   -- _1 _2,
   StandardComponent             -- KW["#C"] _1 _2 _3,
   StandardComponent.3:iter-star -- _1,
   SystemComponent               -- KW["#SC"] _1 _2 _3,
   SystemComponent.3:iter-star   -- _1,
   BehaviorSeq                   -- _1 _2,
   BehaviorSeq.2:iter-star       -- _1,
   Behavior                      -- _1 _2,
   Root                          -- _1,
   AtomicSequence                -- _1 _2,
   AtomicSequence.1:iter-sep     -- _1 KW[";;"],
   AtomicSequence.2:opt          -- _1,
   AtomicSequence.2:opt.1:seq    -- KW[";"] _1,
   AlternativeBranch             -- _1 KW["#N"] KW["{"] _2 KW["}"],
   AlternativeBranch.1:iter-sep  -- _1 KW[";;"],
   AlternativeBranch.2:iter-star -- _1,
   ParallelBranch                -- _1 KW["#P"] KW["{"] _2 KW["}"],
   ParallelBranch.1:iter-sep     -- _1 KW[";;"],
   ParallelBranch.2:iter-star    -- _1,
   StandardNode                  -- _1 _2 _3 _4 _5 _6,
   StandardNode.5:opt            -- _1,
   EmptyNode                     -- KW["_"] _1 _2,
   EmptyNode.1:opt               -- _1
]